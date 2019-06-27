package com.erkanmericmert.babycontroller;

import java.time.LocalDate;

public class Tooth {
    private LocalDate date;
    private boolean teethe;

    public Tooth(LocalDate date){
        this.date = date;
        this.teethe = true;
    }

    public Tooth(){
        this.teethe = true;
    }

    public LocalDate getTeetheDate(){
        return date;
    }

    public void setTeetheDate(LocalDate date){
        this.date = date;
    }

    public boolean getTeethe(){
        return teethe;
    }

    public void setTheethe(boolean teethe){
        this.teethe = teethe;
    }

}