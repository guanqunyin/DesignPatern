package com.yin.pattern.ASM;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

import java.io.IOException;

import static org.objectweb.asm.Opcodes.ASM4;

/**
 * Created by Administrator on 2019/10/30.
 * 通过继承ClassVisitor重写了它的print方法，可以让我们更直观的看到其内部数据结构
 */
public class ClassPrinter extends ClassVisitor {
    public ClassPrinter() {
        super(ASM4);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println(name + " extends " + superName + "{");
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        System.out.println("    "+ access + "    " + descriptor + "   " + name);
        return null;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        System.out.println("    " + name + "()");
        return null;
    }

    @Override
    public void visitEnd() {
        System.out.println("}");
    }

    public static void main(String[] args) throws IOException {
        //访问者
        ClassVisitor classVisitor = new ClassPrinter();
//        ClassReader classReader = new ClassReader("java.lang.String");D:\IdeaWorkSpace\DesignPattern\src\main\java\
        //被访问者
        ClassReader classReader = new ClassReader(ClassPrinter.class.getResourceAsStream("T1.class"));

        //内部会一次调用访问者声明的方法
        classReader.accept(classVisitor, 0);
    }
}
