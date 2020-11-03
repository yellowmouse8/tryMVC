package ru.specialist.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import ru.specialist.model.Course;
import ru.specialist.DAO.CourseRepository;
import ru.specialist.service.CourseService;


@Transactional
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return Lists.newArrayList(courseRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Course findById(int id) {
        return courseRepository.findOne(id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    @Transactional
    public void delete(int id) {
    courseRepository.delete(id);
    }
}
