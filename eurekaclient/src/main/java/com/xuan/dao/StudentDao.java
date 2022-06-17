package com.xuan.dao;

import com.xuan.entity.Student;

import java.util.Collection;

/**
 * @version 1.0
 * @auther jiangning
 * @date 2022/6/15
 */
public interface StudentDao {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
