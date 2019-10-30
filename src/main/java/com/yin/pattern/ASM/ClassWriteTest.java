package com.yin.pattern.ASM;

import org.objectweb.asm.ClassWriter;

import static org.objectweb.asm.Opcodes.*;

/**
 * Created by Administrator on 2019/10/30.
 */
public class ClassWriteTest {

    public static void main(String[] args) {
        ClassWriter classWriter = new ClassWriter(0);
        classWriter.visit(V1_5, ACC_PUBLIC +ACC_ABSTRACT+ACC_INTERFACE,
                "pkg/Comparable", null, "java/lang/Object",
                null);
        classWriter.visitField(ACC_PUBLIC +ACC_FINAL + ACC_STATIC, "LESS", "I",
                null, -1).visitEnd();
        classWriter.visitField(ACC_PUBLIC +ACC_FINAL + ACC_STATIC, "EQUAL", "I",
                null, 0).visitEnd();
        classWriter.visitField(ACC_PUBLIC +ACC_FINAL + ACC_STATIC, "GREATER", "I",
                null, 1).visitEnd();
        classWriter.visitMethod(ACC_PUBLIC +ACC_ABSTRACT, "compareTo",
                "(Ljava/lang/Object;)I", null, null).visitEnd();
        classWriter.visitEnd();
        byte[] b = classWriter.toByteArray();

        MyClassLoader myClassLoader = new MyClassLoader();
        Class aClass = myClassLoader.defineClass("pkg.Comparable", b);
        System.out.println(aClass.getMethods()[0].getName());


    }
}
