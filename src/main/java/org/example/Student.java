package org.example;

import java.util.ArrayList;

public class Student {
    private final String name;
    private final Group group;
    ArrayList<AcademicPerformance> marks = new ArrayList<>();
    public Student(String name, Group group, ArrayList<AcademicPerformance> marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return name;
    }
    public String toString() {
        return name + " " + group.toString();
    }
}

