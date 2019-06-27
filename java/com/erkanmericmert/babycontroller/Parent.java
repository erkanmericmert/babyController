package com.erkanmericmert.babycontroller;

import java.time.LocalDate;
import java.util.ArrayList;

public class Parent {

    private final String userID;
    private String name;    // isim soyisim birlikte
    private LocalDate birthDay;  //Represents a date (year, month, day (yyyy-MM-dd))
    private String eMail; // e-mail
    private ArrayList<Baby> babies; //

    public Parent(String name, String eMail, String userID) {
        this.userID = userID;
        this.name = name;
        //this.birthDay = birthDay;
        this.eMail = eMail;
        babies = new ArrayList<>();
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

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getUserID(){
        return userID;
    }

    public void setBaby(Baby baby){
        babies.add(baby);
    }

    public Baby getBabies(int index){
        return babies.get(index);
    }

    public int getNumberOfBabies(){
        return babies.size();
    }
}