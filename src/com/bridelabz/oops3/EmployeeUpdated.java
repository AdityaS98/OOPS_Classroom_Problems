package com.bridelabz.oops3;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}


public class EmployeeUpdated {

    static void swapObject(Employee emp1, Employee emp2) {
        String tempName = emp1.getName();
        int tempAge = emp1.getAge();

        emp1.setName(emp2.getName());
        emp1.setAge(emp2.getAge());

        emp2.setName(tempName);
        emp2.setAge(tempAge);

    }


    public static void main(String[] args) {
        Employee emp1 = new Employee("Nitish", 25);
        Employee emp2 = new Employee("Aditya", 24);
        emp1.displayInfo();
        emp2.displayInfo();

        swapObject(emp1, emp2);

        emp1.displayInfo();
        emp2.displayInfo();
    }
}



