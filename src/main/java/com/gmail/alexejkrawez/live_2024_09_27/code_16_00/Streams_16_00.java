package com.gmail.alexejkrawez.live_2024_09_27.code_16_00;

import com.gmail.alexejkrawez.help.Teacher;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.gmail.alexejkrawez.help.Getter.getTeachers;
import static org.slf4j.LoggerFactory.getLogger;

public class Streams_16_00 {

    private static final Logger log = getLogger(Streams_16_00.class);


    public static void main(String[] args) {
        log.info("Hello " + Streams_16_00.class.getSimpleName() + "!");


        // Создать с помощью стрима список из слов.
        String s = "lime apple coconut banana cacao avocado cherry apricot lemon currant";
        List<String> words = Arrays.stream(s.split(" ")).collect(Collectors.toList());


        // Убедиться что ни один из фруктов не оканчивается на букву n
        boolean bool = words.stream().noneMatch(w -> w.endsWith("n"));
        log.info("all fruits ends with 'n': " + bool); // false


        // Сгруппировать список фруктов по длинам их названий. Привести названия фруктов к верхнему регистру.
        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(w -> w.length(), Collectors.toList()));
        collect.forEach((k,v) -> log.info(k + " - " + v.stream().collect(Collectors.joining(", "))));


        log.info("////////////////////////////////");
        // Создать стрим с числами от 10 до 100 (включительно)

        List<Integer> collect1 = IntStream.rangeClosed(10, 100).boxed().collect(Collectors.toList());
        collect1.forEach(u -> log.info(u.toString()));

        // Найти сумму квадратов всех четных чисел в промежутке от 10 до 100.
        int sumOfSquares = IntStream.rangeClosed(10, 100)
                .filter(e -> (e % 2 == 0))
                .map(e -> e * e)
                .sum();

        log.info("sumOfSquares {}", sumOfSquares); // 171580


        // Найти произведение всех чисел, кратных 5
        int multiply = IntStream.rangeClosed(10, 100)
                .filter(e -> (e % 5 == 0))
                .reduce(1, (a, b) -> (a * b));

        log.info("multiply {}", multiply); // 417595392


        log.info("////////////////////////////////");
        int[] arr = {1, 16, 3, 18, 7, 26, 8, 19, 10, 34, 5, 3, 26, 7, 16, 19, 1};

        // Вывести в log данные до встречи цифры 5 в отсортированном по убыванию виде.
        // 34 26 19 18 16 10 8 7 3 1


        // Получить и вывести в log статистические данные.



        log.info("////////////////////////////////");
        List<Teacher> teachers = getTeachers();

        // Получить список всех учеников, отсортированных по имени в обратном алфавитном порядке.
//        teachers.stream()


        log.info("----------");
        // Вывести в log "возраст учителя - имена студентов, которых он обучает".
//        teachers.stream()


        log.info("----------");
        // Вывести в log "имя учителя - список уникальных предметов, которые изучают его ученики".
//        teachers.stream()


        log.info("----------");
        // Вывести в log "имя учителя - количество его студентов с именем John (если они есть)"
//        teachers.stream()


        log.info("----------");
        // Вывести в log "предмет - имена учеников через запятую, изучающих этот предмет".
//        teachers.stream()


        log.info("----------");
        // Получить список учителей, отсортированных по количеству студентов, у которых есть предмет "ALGEBRA".
        // Вывести "учитель - ученики с предметом ALGEBRA".
//        teachers.stream()


        log.info("----------");
        // Вывести "имя учителя - самый любимый предмет среди его учеников".
        // Если есть несколько самых любимых предметов - вывести через запятую все
//        teachers.stream()

    }

}