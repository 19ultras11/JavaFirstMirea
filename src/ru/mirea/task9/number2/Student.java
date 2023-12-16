package ru.mirea.task9.number2;

class Student {
    private String name;
    private int gpa;

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }
}