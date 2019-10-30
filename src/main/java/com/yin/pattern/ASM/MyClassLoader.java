package com.yin.pattern.ASM;

/**
 * Created by Administrator on 2019/10/30.
 */
class MyClassLoader extends ClassLoader{

    public Class defineClass(String name, byte[] b){
        return defineClass(name, b, 0, b.length);
    }

}
