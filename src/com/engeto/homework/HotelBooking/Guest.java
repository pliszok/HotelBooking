package com.engeto.homework.HotelBooking;

import java.time.LocalDate;

public class Guest {
    //region atributes
    private String name;
    private LocalDate born;
    //endregion

    public Guest(String name, LocalDate born){
        this.name = name;
        this.born = born;
    }

    public String toString(){
        return getName()+", narozen/narozena "+getBorn();
    }

    //region GetterSetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }
    //endregion
}
