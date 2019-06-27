package com.erkanmericmert.babycontroller;

import java.time.LocalDate;
import java.util.ArrayList;

public class Week {

    private double height;
    private double weight;
    private double headMeasurement;
    private LocalDate startDate;
    private LocalDate finishDate;
    private ArrayList<Note> notes; //

    public Week(double height, double weight, double headMeasurement, LocalDate startDate) {
        this.height = height;
        this.weight = weight;
        this.headMeasurement = headMeasurement;
        this.startDate = startDate;
        this.finishDate = startDate.plusDays(7);
        notes = new ArrayList<>();
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getheight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeadMeasurement(double headMeasurement) {
        this.headMeasurement = headMeasurement;
    }

    public double getHeadMeasurement() {
        return headMeasurement;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public void setNote(Note note) {
        this.notes.add(note);
    }

    public Note getNote(int index) {
        return notes.get(index);
    }

    public int getNumberOfNotes(){
        return notes.size();
    }

    public Note getWeek(int indexNumber) {
        return notes.get(indexNumber);
    }

}
