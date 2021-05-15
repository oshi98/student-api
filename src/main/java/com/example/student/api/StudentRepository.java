package com.example.student.api;

public interface StudentRepository {
    void save(Student student);

    Student get(String id);

    Student delete(String id);

    Student update(Student student);
}
