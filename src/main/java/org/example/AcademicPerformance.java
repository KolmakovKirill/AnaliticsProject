package org.example;
import java.util.HashMap;

public class AcademicPerformance {

    HashMap<String, Integer> exercises = new HashMap<>();
    HashMap<String, Integer> homework = new HashMap<>();
    protected final int activityPoints;
    protected final int seminaryPoints;

    public AcademicPerformance(HashMap<String, Integer> exercises, HashMap<String, Integer> homework, int activityPoints, int seminaryPoints) {
        this.exercises = exercises;
        this.homework = exercises;
        this.activityPoints = activityPoints;
        this.seminaryPoints = seminaryPoints;
    }
}
