package org.example;
import java.util.ArrayList;

public class FinalResult {

    private final boolean isRetook;
    ArrayList<Student> students = new ArrayList<>();

    public FinalResult(boolean isRetook) {

        this.isRetook = isRetook;
    }

    public boolean isRetook() {

        return isRetook;
    }
}
