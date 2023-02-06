package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {

    // member field
    private double gpa;

    public Student(String name, short age) {
        super(name, age); // parameters are sent into Person
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // overrides the super class' method
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // formats and prints the respective information
    @Override
    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nGPA: " + getGPA();
    }

}
