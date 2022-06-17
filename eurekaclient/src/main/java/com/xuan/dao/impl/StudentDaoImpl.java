package com.xuan.dao.impl;

import com.xuan.dao.StudentDao;
import com.xuan.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @auther jiangning
 * @date 2022/6/15
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    private static Map<Long,Student> studentMap;
    static {
        studentMap=new HashMap<>();
        studentMap.put(1l,new Student(1l,"张三","男",24));
        studentMap.put(2l,new Student(2l,"李四","男",22));
        studentMap.put(3l,new Student(3l,"翠花","女",22));

    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
