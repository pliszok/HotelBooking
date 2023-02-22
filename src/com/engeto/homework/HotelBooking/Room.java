package com.engeto.homework.HotelBooking;

import java.math.BigDecimal;

public class Room {
    //region atributes
    private int roomNumber;
    private int beds;
    private BigDecimal price;
    private boolean isBalcony;
    private boolean isSeaview;
    //endregion

    public String toString(){
        return "Pokoj číslo "+getRoomNumber()+" - počet postelí: "+getBeds()+", cena: "+getPrice()+ "Kč, balkon: "+isBalcony()+", výhled na moře: "+isSeaview()+".";
    }

    public Room(int roomNumber, int beds, BigDecimal price, boolean isBalcony, boolean isSeaview){
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.price = price;
        this.isBalcony = isBalcony;
        this.isSeaview = isSeaview;
    }

    //region GetterSetter
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSeaview() {
        return isSeaview;
    }

    public void setSeaview(boolean seaview) {
        isSeaview = seaview;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    //endregion
}
