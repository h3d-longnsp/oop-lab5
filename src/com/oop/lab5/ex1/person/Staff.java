package com.oop.lab5.ex1.person;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("Staff[%s, school = %s, pay = %.4f]", super.toString(), this.school, this.pay);
    }
}