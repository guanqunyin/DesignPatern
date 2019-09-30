package com.yin.pattern.factory.factorymethod;

import com.yin.pattern.factory.simplefactory.ICourse;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
