package com.erkanmericmert.babycontroller;


import java.time.LocalDate;
import java.util.HashMap;

public class Baby {

    private static int iDCount = 0;
    private final int babyID;
    private String name;    // isim soyisim birlikte
    private LocalDate birthDay;  //Represents a date (year, month, day (yyyy-MM-dd))
    private String bloodType;
    private HashMap<Integer, Week> week;
    private HashMap<Integer, Tooth> tooths; //

    public Baby(String name, LocalDate birthDay, String bloodType) {
        this.iDCount = this.iDCount + 1;
        this.babyID = this.iDCount;
        this.name = name;
        this.birthDay = birthDay;
        this.bloodType = bloodType;
        week = new HashMap<Integer, Week>();
        tooths = new HashMap<Integer, Tooth>();
    }

    public void setWeek(int weekNumber, Week week) {
        this.week.put(weekNumber, week);
    }

    public Week getWeek(int weekNumber) {
        return week.get(weekNumber);
    }

    public int getBabyID() {
        return babyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}