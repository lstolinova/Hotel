package com.stolinovaHotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest adela = new Guest("Adela","Maliková", LocalDate.of(1993,3,13));
        Guest jan = new Guest("Jan","Dvořák",LocalDate.of(1995,5,5));
        jan.setBirthday(LocalDate.of(1995,4,5));
        System.out.println(jan.getDescriptionGuest());
Room room1 = new Room("pokoj číslo 1",2,true,false, new BigDecimal(2400));
Room room3 = new Room("pokoj číslo 3",1,true,true,new BigDecimal(1000));

Booking booking1=new Booking(adela, LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),"Pracovní pobyt");
Booking booking2=new Booking(adela, jan,LocalDate.of(2021,9,1),LocalDate.of(2021,9,1),"Rekreační pobyt");
        List<Booking> allBookings = new ArrayList<>();
        allBookings.add(booking1);
        allBookings.add(booking2);
        System.out.println("Seznam rezervací v systému:");
        for (Booking booking : allBookings) {
            System.out.println(booking.getDescriptionBokking());
        }
        }


        }

