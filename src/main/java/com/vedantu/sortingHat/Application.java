package main.java.com.vedantu.sortingHat;

import main.java.com.vedantu.sortingHat.model.FoodPreference;
import main.java.com.vedantu.sortingHat.model.Group;
import main.java.com.vedantu.sortingHat.service.AssignmentService;

public class Application {
    AssignmentService assignmentService;

    public Application(int capacity) {
        this.assignmentService = new AssignmentService(capacity);
    }

    public void registerStudent(int registrationNumber, String groupSelected, String foodTypeSelected) {
        FoodPreference foodPreference = FoodPreference.V;
        Group group = Group.A;
        if (foodTypeSelected == "NV") foodPreference = FoodPreference.NV;
        if (groupSelected == "B") group = group.B;
        assignmentService.register(registrationNumber, group, foodPreference);
    }

    public void finish() {
        // TODO: call print method
    }
}
