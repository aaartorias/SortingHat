package main.java.com.vedantu.sortingHat.model;

public class Student {
    private Integer registrationNumber;
    private String name;
    private FoodPreference foodPreference;
    private Class className;

    public Student(Integer registrationNumber, Class className, FoodPreference foodPreference) {
        this.registrationNumber = registrationNumber;
        this.className = className;
        this.foodPreference = foodPreference;
    }

    public Student(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
        this.name = null;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
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

    public void setFoodPreference(FoodPreference foodPreference) {
        this.foodPreference = foodPreference;
    }

    public Class getClassName() {
        return className;
    }

    public void setClassName(Class className) {
        this.className = className;
    }
}
