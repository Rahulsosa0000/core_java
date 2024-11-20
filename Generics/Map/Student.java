package com.Generics.Map;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int id;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }

    // Comparable method to sort by ID (or adjust to sort by name/age as needed)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);  // Sorting by ID
    }
}
