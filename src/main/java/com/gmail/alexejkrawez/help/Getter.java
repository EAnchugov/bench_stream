package com.gmail.alexejkrawez.help;

import java.util.List;

import static com.gmail.alexejkrawez.help.Subject.ALGEBRA;
import static com.gmail.alexejkrawez.help.Subject.BIOLOGY;
import static com.gmail.alexejkrawez.help.Subject.CHEMISTRY;
import static com.gmail.alexejkrawez.help.Subject.GEOGRAPHY;
import static com.gmail.alexejkrawez.help.Subject.GEOMETRY;
import static com.gmail.alexejkrawez.help.Subject.HISTORY;
import static com.gmail.alexejkrawez.help.Subject.LITERATURE;

public class Getter {

    public static List<Teacher> getTeachers() {
        List<Teacher> teachers = List.of(
                new Teacher(
                        1L,
                        "William",
                        34,
                        List.of(
                                new Student(1L, "John", List.of(LITERATURE, GEOMETRY)),
                                new Student(2L, "Mark", List.of(ALGEBRA, GEOMETRY)),
                                new Student(3L, "William", List.of(ALGEBRA, GEOMETRY)),
                                new Student(4L, "John", List.of(HISTORY, CHEMISTRY))
                        )
                ),
                new Teacher(
                        2L,
                        "Brian",
                        27,
                        List.of(
                                new Student(5L, "Kenny", List.of(GEOGRAPHY, HISTORY)),
                                new Student(6L, "John", List.of(BIOLOGY, LITERATURE)),
                                new Student(7L, "Smith", List.of(ALGEBRA, CHEMISTRY)),
                                new Student(8L, "Steven", List.of(HISTORY, BIOLOGY))
                        )
                ),
                new Teacher(
                        3L,
                        "Smith",
                        52,
                        List.of(
                                new Student(9L, "Bob", List.of(GEOGRAPHY, ALGEBRA)),
                                new Student(10L, "Kenny", List.of(LITERATURE, HISTORY)),
                                new Student(11L, "Brian", List.of(GEOGRAPHY, GEOMETRY)),
                                new Student(12L, "Kevin", List.of(CHEMISTRY, BIOLOGY))
                        )
                ),
                new Teacher(
                        4L,
                        "Steven",
                        38,
                        List.of(
                                new Student(10L, "Bob", List.of(CHEMISTRY, GEOMETRY)),
                                new Student(11L, "Kris", List.of(ALGEBRA, BIOLOGY)),
                                new Student(12L, "Mark", List.of(HISTORY, ALGEBRA)),
                                new Student(13L, "Joseph", List.of(LITERATURE, GEOGRAPHY))
                        )
                ),
                new Teacher(
                        5L,
                        "Oleg",
                        46,
                        List.of(
                                new Student(14L, "John", List.of(LITERATURE, GEOGRAPHY)),
                                new Student(15L, "Valera", List.of(CHEMISTRY, ALGEBRA)),
                                new Student(16L, "Vasya", List.of(LITERATURE, BIOLOGY)),
                                new Student(17L, "Stepan", List.of(CHEMISTRY, GEOGRAPHY))
                        )
                )
        );
        return teachers;
    }
}
