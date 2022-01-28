package main.java.com.vedantu.sortingHat.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class House {
    private String name;
    private String id;
    private FoodPreference foodPreference;
    private Class className;
    private Integer capacity;
    private List<Integer> students;

    public House(FoodPreference foodPreference, Class className, Integer capacity) {
        this.foodPreference = foodPreference;
        this.className = className;
        this.capacity = capacity;
        this.id = className.toString() + foodPreference.toString();
        this.students = Collections.synchronizedList(new ArrayList<>());
    }

    public boolean isFull() {
        return students.size() >= getCapacity();
    }

    public boolean addStudent(Student student) {
        if (!isFull()) {
            students.add(student.getRegistrationNumber());
            return true;
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodPreference getFoodPreference() {
        return foodPreference;
    }

    public Class getClassName() {
        return className;
    }

    public Integer getCapacity() {
        return capacity;
    }
}
