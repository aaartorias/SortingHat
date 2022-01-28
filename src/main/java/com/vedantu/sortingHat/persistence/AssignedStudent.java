package main.java.com.vedantu.sortingHat.persistence;

import java.util.*;

public class AssignedStudent {
    HashMap<String, List<Integer>> studentsByHouse;
    Set<Integer> students;
    public AssignedStudent() {
        this.studentsByHouse = new HashMap<>();
        this.students = new HashSet<>();
    }

    public void assignHouseToStudent(String houseId, Integer studentId) {
        if (!studentsByHouse.containsKey(houseId)) {
            studentsByHouse.put(houseId, new ArrayList<>());
        }
        studentsByHouse.get(houseId).add(studentId);
        students.add(studentId);
    }

    public List<Integer> getStudentsForHouse(String houseId) {
        return studentsByHouse.get(houseId);
    }

    public HashMap<String, List<Integer>> getAllStudentsByHouse() {
        return studentsByHouse;
    }

    public boolean studentExists(Integer studentId) {
        return students.contains(studentId);
    }
}
