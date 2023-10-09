package com.bridelabz.oops_1;
// Write a Java program to create a class called
// "Employee" with instance variables "name," "salary," and "ID." Include a method to
// calculate the employee's yearly salary and a method to print the employee's name and salary

class Employee{
    private String name;
    private int id;

    private double salary;

    public Employee(String name, int id, double salary) {
       this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", Annual salary=" + salary*12 +
                '}';
    }
}

public class EmployeeSecond {
    public static void main(String[] args) {

        Employee obj =new Employee("Aditya",1,50000);

        System.out.println(obj);

    }
}
