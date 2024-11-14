package com.gmail.alexejkrawez.live_2024_09_27.code_16_00;

import com.gmail.alexejkrawez.help.Student;
import com.gmail.alexejkrawez.help.Subject;
import com.gmail.alexejkrawez.help.Teacher;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.gmail.alexejkrawez.help.Getter.getTeachers;
import static org.slf4j.LoggerFactory.getLogger;

public class streams2 {

    private static final Logger log = getLogger(Streams_16_00.class);


    public static void main(String[] args) {
//        log.info("Hello " + Streams_16_00.class.getSimpleName() + "!");
//
//
//        // Создать с помощью стрима список из слов.
//        String s = "lime apple coconut banana cacao avocado cherry apricot lemon currant";
//        List<String> words = Arrays.asList(s.split(" "));
//        //       System.out.println(words);
////
////
////        // Убедиться что ни один из фруктов не оканчивается на букву n
//        boolean bool = words.stream().noneMatch(e -> e.endsWith("n"));
//        log.info("all fruits ends with 'n': " + bool); // false
////
////
////        // Сгруппировать список фруктов по длинам их названий. Привести названия фруктов к верхнему регистру.
//        Map<Integer, List<String>> map =
//            words.stream().collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()));
//        log.info(map.toString());
////        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(w -> w.length(), Collectors.toList()));
////        Создать стрим с числами от 10 до 100 (включительно)
//        List<Integer> integerList = IntStream.rangeClosed(10, 100).boxed().collect(Collectors.toList());
////
////        List<Integer> collect1 = IntStream.rangeClosed(10, 100).boxed().collect(Collectors.toList());
//        log.info(integerList.toString());
////
////        // Найти сумму квадратов всех четных чисел в промежутке от 10 до 100.
//        int sumOfSquares = integerList.stream()
//            .filter(e -> e % 2 == 0)
//            .map(n -> n * n)
//            .mapToInt(Integer::intValue)
//            .sum();
//
//        log.info("sumOfSquares {}", sumOfSquares); // 171580
//
//        int multiply = integerList.stream()
//            .filter(e -> e % 5 == 0)
//            .reduce(1, (subTotal, element) -> subTotal * element);
//
//        log.info("multiply {}", multiply); // 417595392
////
////
////        log.info("////////////////////////////////");
//        int[] arr = {1, 16, 3, 18, 7, 26, 8, 19, 10, 34, 5, 3, 26, 7, 16, 19, 1};
////
////        // Вывести в log данные до встречи цифры 5 в отсортированном по убыванию виде.
//        Arrays.stream(arr)
//            .takeWhile(value -> value != 5)
//            .boxed()
//            .sorted((a, b) -> b - a)
//            .forEach(System.out::print);
////        // 34 26 19 18 16 10 8 7 3 1
////
////
//        // Получить и вывести в log статистические данные.
//
//
//
//        log.info("////////////////////////////////");
        List<Teacher> teachers = getTeachers();
//
//         Получить список всех учеников, отсортированных по имени в обратном алфавитном порядке.
//        List<Student> collect = teachers.stream()
//            .flatMap(teacher -> teacher.getStudents().stream())
//            .collect(Collectors.toList()).stream().sorted(Comparator.comparing(Student::getName).reversed())
//            .collect(Collectors.toList());

//        for (Student student : collect) {
//            System.out.println(student.getName());
//        }

//
//
//        log.info("----------");
//        // Вывести в log "возраст учителя - имена студентов, которых он обучает".
//        teachers.forEach(t -> {
//            String studentNames = t.getStudents().stream()
//                .map(Student::getName)
//                .reduce((s1, s2) -> s1 + ", " + s2)
//                .orElse("-------");
//            System.out.println(t.getName() + " - " + studentNames);
//        });
//
//
       log.info("----------");
//        // Вывести в log "имя учителя - список уникальных предметов, которые изучают его ученики".
        teachers.stream()
            .forEach(teacher -> {
                List<Subject> uniqueSubjects = teacher.getStudents().stream()
                    .flatMap(student -> student.getFavoriteSubjects().stream())
                    .distinct()
                    .collect(Collectors.toList());

                System.out.println(teacher.getName() + " - " + uniqueSubjects);
            });
//
//        log.info("----------");
//        // Вывести в log "имя учителя - количество его студентов с именем John (если они есть)"
       teachers.stream().forEach(teacher -> {
           List<Student> students = teacher.getStudents().stream()
               .filter(student -> student.getName().equals("John"))
               .collect(Collectors.toList());
           System.out.println(teacher.getName() + " - " + students.size());
           });

//
//
//        log.info("----------");
//        // Вывести в log "предмет - имена учеников через запятую, изучающих этот предмет".
////        teachers.stream()
        List<String> subjectStudents = teachers.stream()
            .flatMap(teacher -> teacher.getStudents().stream()
                .flatMap(student -> student.getFavoriteSubjects().stream())
                .distinct()
                .map(subject -> subject + " - " + teacher.getStudents().stream()
                    .filter(student -> student.getFavoriteSubjects().contains(subject))
                    .map(Student::getName)
                    .collect(Collectors.joining(", "))))
            .collect(Collectors.toList());

        log.info("subjectStudents: " + subjectStudents);
//
//
//        log.info("----------");
//        // Получить список учителей, отсортированных по количеству студентов, у которых есть предмет "ALGEBRA".
//        // Вывести "учитель - ученики с предметом ALGEBRA".
////        teachers.stream()
//
//
//        log.info("----------");
        // Вывести "имя учителя - самый любимый предмет среди его учеников".
        // Если есть несколько самых любимых предметов - вывести через запятую все
//        teachers.stream()

    }

}