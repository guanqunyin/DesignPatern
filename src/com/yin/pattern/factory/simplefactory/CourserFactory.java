package com.yin.pattern.factory.simplefactory;

public class CourserFactory {

    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else {
            return null;
        }
    }
}
