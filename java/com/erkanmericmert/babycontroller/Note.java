package com.erkanmericmert.babycontroller;

import java.time.LocalDate;

public class Note {

    private static int noteCount = 0;
    private final int noteID;
    private LocalDate date;
    private String content;
    //private String userName;
    private int userID;

    public Note(int userID, String content, LocalDate date) {
        this.noteCount++;
        this.noteID = this.noteCount;
        this.userID = userID;
        this.content = content;
        this.date = date;
    }

    public void setContent(String Content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getLocalDate() {
        return date;
    }

    public int getNoteID() {
        return noteID;
    }
}
