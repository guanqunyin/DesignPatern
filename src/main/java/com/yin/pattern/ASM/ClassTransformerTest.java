package com.yin.pattern.ASM;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.ASM4;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;

public class ClassTransformerTest {

    public static void main(String[] args) throws IOException {
        ClassReader classReader = new ClassReader(ClassTransformerTest.class.getClassLoader().getResourceAsStream("com/yin/pattern/ASM/Tank.class"));

        ClassWriter classWriter = new ClassWriter(0);

        ClassVisitor classVisitor = new ClassVisitor(ASM4, classWriter) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor methodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions);

                return new MethodVisitor(ASM4,methodVisitor) {
                    @Override
                    public void visitCode() {
                        visitMethodInsn(INVOKESTATIC, "TimeProxy", "before", "()V", false);
                        super.visitCode();
                    }
                };
            }
        };

        classReader.accept(classVisitor, 0);

        byte[] bytes = classWriter.toByteArray();

        //创建本地文件夹
        String path = System.getProperty("user.dir");
        File dir = new File(path + "/com/yin/pattern/ASM");
        if (!dir.exists())
            dir.mkdirs();

        //写到file里面去
        File file = new File(path + "/com/yin/pattern/ASM/Tank_0.class");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
    }

}
