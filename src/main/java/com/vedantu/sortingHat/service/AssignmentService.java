package main.java.com.vedantu.sortingHat.service;

import main.java.com.vedantu.sortingHat.model.FoodPreference;
import main.java.com.vedantu.sortingHat.model.Group;
import main.java.com.vedantu.sortingHat.model.House;
import main.java.com.vedantu.sortingHat.model.Student;
import main.java.com.vedantu.sortingHat.persistence.AssignedStudent;
import main.java.com.vedantu.sortingHat.persistence.DeclinedStudent;

import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AssignmentService {

    private Queue<Student> studentQueue;
    private AssignedStudent assignedStudent;
    private DeclinedStudent declinedStudent;

    public AssignmentService(int capacity) {
        this.studentQueue = new ConcurrentLinkedQueue<>();
        this.assignedStudent = new AssignedStudent();
        this.declinedStudent = new DeclinedStudent();
    }


    public void register(int registrationNumber, Group group, FoodPreference foodPreference) {
        if (assignedStudent.exists(registrationNumber)
                || declinedStudent.exists(registrationNumber))
            return;
        // TODO: Add student in queue
    }

    // TODO: Print students - assigned and declined

}
