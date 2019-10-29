package com.yin.pattern.factory.abstractfactory;

import com.yin.pattern.factory.simplefactory.ICourse;

public interface AbstractCourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
