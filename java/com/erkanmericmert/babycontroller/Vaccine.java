package com.erkanmericmert.babycontroller;

public class Vaccine {

    private String name;
    private int week;
    private int dose;
    private boolean mandatory;
    private boolean status;

    public Vaccine(String name, int week, int dose, boolean mandatory) {
        this.name = name;
        this.week = week;
        this.dose = dose;
        this.mandatory = mandatory;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
