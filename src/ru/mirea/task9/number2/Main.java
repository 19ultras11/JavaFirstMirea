package ru.mirea.task9.number2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Александр", 90),
                new Student("Михаил", 95),
                new Student("Евгения", 99),
                new Student("Николай", 100),
                new Student("Кирилл", 1)
        };

        java.util.Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("Список студентов, отсортированный по убыванию баллов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + ", Итоговый балл: " + student.getGpa());
        }
    }
}
