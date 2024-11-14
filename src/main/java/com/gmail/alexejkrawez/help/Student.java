package com.gmail.alexejkrawez.help;

import java.util.List;
import java.util.Objects;

public class Student {
    private Long   id;
    private String        name;
    private List<Subject> favoriteSubjects;

    public Student() { }

    public Student(Long id, String name, List<Subject> favoriteSubjects) {
        this.id = id;
        this.name = name;
        this.favoriteSubjects = favoriteSubjects;
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

    public List<Subject> getFavoriteSubjects() {
        return favoriteSubjects;
    }

    public void setFavoriteSubjects(List<Subject> favoriteSubjects) {
        this.favoriteSubjects = favoriteSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Student )) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favoriteSubjects=" + favoriteSubjects +
                '}';
    }
}
