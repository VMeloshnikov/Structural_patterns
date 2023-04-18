package org.example.composite;

public class Employee implements OrganizationComponent{

    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee: Name:" + name + ", Position: " + position);

    }
}
