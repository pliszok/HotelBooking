package com.engeto.homework.HotelBooking;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
    //region atributes
    private ArrayList<Guest> guestList;
    private Room room;
    private LocalDate start;
    private LocalDate end;
    private boolean isHoliday;
    //endregion

    public Booking(ArrayList<Guest> guest, Room room, LocalDate start, LocalDate end){
        this.guestList = guest;
        this.room = room;
        this.start = start;
        this.end = end;
    }
    public String toString(){
        return  "Tato rezervace je pro "+this.getGuestList()+". "+this.getRoom();
    }


    //region GetterSetter
    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    public void setHoliday(boolean holiday) {
        isHoliday = holiday;
    }
    //endregion
}
