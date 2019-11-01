package com.yin.pattern.ASM;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.*;

/**
 * Created by Administrator on 2019/10/30.
 * 模拟了通过asm动态生成一个class
 */
public class ClassWriteTest {

    public static void main(String[] args) throws IOException {
        //定义了访问者
        ClassWriter classWriter = new ClassWriter(0);

        //直接调用访问者的方法，不用声明一个类，直接调用，封装性更好点就可以新建一个被访问者的类。
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
        System.out.println(aClass.getName());



        //打印该生成类的大概类型
        ClassVisitor classVisitor = new ClassPrinter();
//        ClassReader classReader = new ClassReader("pkg.Comparable");
        //被访问者
        ClassReader classReader = new ClassReader(new ByteArrayInputStream(b));

        //内部会一次调用访问者声明的方法
        classReader.accept(classVisitor, 0);


    }
}
