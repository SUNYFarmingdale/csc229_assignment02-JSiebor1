package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Person {

    // member variables
    private String name;
    protected String address; // it is important that this is protected so that class Student obtains access
    private short age;

    // constructor that takes only two paras
    public Person(String name, short age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getAddress();

    public abstract void setAddress(String address);

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

}
