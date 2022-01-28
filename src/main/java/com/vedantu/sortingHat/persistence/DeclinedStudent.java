package main.java.com.vedantu.sortingHat.persistence;

import java.util.HashSet;
import java.util.Set;

public class DeclinedStudent {
    Set<Integer> students;

    public DeclinedStudent() {
        this.students = new HashSet<>();
    }

    public void add(Integer studentId) {
        students.add(studentId);
    }

    public Set<Integer> getStudents() {
        return students;
    }

    public boolean exists(Integer studentId) {
        return students.contains(studentId);
    }
}
