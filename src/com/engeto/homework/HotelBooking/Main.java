package com.engeto.homework.HotelBooking;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guest guest1;
        Guest guest2;
        Room room1;
        Room room2;
        Room room3;
        Booking booking1;
        Booking booking2;

        guest1 = new Guest("Adéla Malíková", LocalDate.of(1993,03,13));
        guest2 = new Guest("Jan Dvořáček", LocalDate.of(1995, 05, 05));
        System.out.println("Host: jméno - " + guest1.getName() +", narozen/narozena - " + guest1.getBorn() + ".");
        System.out.println("Host: jméno - " + guest2.getName() +", narozen/narozena - " + guest2.getBorn() + ".");
        System.out.println(guest1);
        System.out.println(guest2);


        room1 = new Room(1,1,BigDecimal.valueOf(1000),true,true);
        room2 = new Room(2,1,BigDecimal.valueOf(1000),true,true);
        room3 = new Room(3,3,BigDecimal.valueOf(2400),false,true);
        System.out.println("Pokoj číslo "+room1.getRoomNumber()+" - počet postelí: "+room1.getBeds()+", cena: "+room1.getPrice()+" Kč, balkón: "+ room1.isBalcony()+", výhled na moře: "+room1.isSeaview()+".");
        System.out.println("Pokoj číslo "+room2.getRoomNumber()+" - počet postelí: "+room2.getBeds()+", cena: "+room2.getPrice()+" Kč, balkón: "+ room2.isBalcony()+", výhled na moře: "+room2.isSeaview()+".");
        System.out.println("Pokoj číslo "+room3.getRoomNumber()+" - počet postelí: "+room3.getBeds()+", cena: "+room3.getPrice()+" Kč, balkón: "+ room3.isBalcony()+", výhled na moře: "+room3.isSeaview()+".");
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);


        ArrayList<Guest> guestList1 = new ArrayList<>();
        guestList1.add(guest1);
        booking1 = new Booking(guestList1, room1, LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
        System.out.println(booking1);

        ArrayList<Guest> guestList2 = new ArrayList<>();
        guestList2.add(guest1);
        guestList2.add(guest2);
        booking2 = new Booking(guestList2, room3, LocalDate.of(2021,9,1),LocalDate.of(2021,9,14));
        System.out.println(booking2);
    }
}