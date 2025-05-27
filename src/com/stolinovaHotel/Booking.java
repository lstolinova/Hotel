package com.stolinovaHotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Guest guest1;
    private Guest otherGuest;
    private LocalDate in;
    private LocalDate out;
    private  String typeOfvacation;

    public Booking(Guest guest1, Guest otherGuest, LocalDate in, LocalDate out, String typeOfvacation) {
        this.guest1 = guest1;
        this.otherGuest = otherGuest;
        this.in = in;
        this.out = out;
        this.typeOfvacation = typeOfvacation;
    }

    public Booking(Guest guest1, LocalDate in, LocalDate out, String typeOfvacation) {
        this.guest1 = guest1;
        this.in = in;
        this.out = out;
        this.typeOfvacation = typeOfvacation;
    }

    public Guest getGuest1() {
        return guest1;
    }

    public void setGuest1(Guest guest1) {
        this.guest1 = guest1;
    }

    public Guest getOtherGuest() {
        return otherGuest;
    }

    public void setOtherGuest(Guest otherGuest) {
        this.otherGuest = otherGuest;
    }

    public LocalDate getIn() {
        return in;
    }

    public void setIn(LocalDate in) {
        this.in = in;
    }

    public LocalDate getOut() {
        return out;
    }

    public void setOut(LocalDate out) {
        this.out = out;
    }

    public String getTypeOfvacation() {
        return typeOfvacation;
    }

    public void setTypeOfvacation(String typeOfvacation) {
        this.typeOfvacation = typeOfvacation;
    }

    public String getDescriptionBokking() {
        return getTypeOfvacation() + getGuest1() +" Další host na pokoji: " +  getOtherGuest() + "  pobyt od "+ getIn() + " do " + getOut();


    }
}





