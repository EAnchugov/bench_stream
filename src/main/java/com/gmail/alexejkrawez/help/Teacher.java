package com.gmail.alexejkrawez.help;

import java.util.List;
import java.util.Objects;

public class Teacher {
    private Long          id;
    private String        name;
    private int           age;
    private List<Student> students;

    public Teacher() {
    }

    public Teacher(Long id, String name, int age, List<Student> students) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Teacher )) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(id, teacher.id) && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", students=" + students +
                '}';
    }
}