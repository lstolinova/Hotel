package com.stolinovaHotel;

import java.math.BigDecimal;

public class Room {
    private String roomName;
    private int lotOfBed;
    private boolean seaView;
    private boolean IsBalcon;
    private BigDecimal price;

    public Room(String roomName, int lotOfBed, boolean seaView, boolean isBalcon, BigDecimal price) {
        this.roomName = roomName;
        this.lotOfBed = lotOfBed;
        this.seaView = seaView;
        IsBalcon = isBalcon;
        this.price = price;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getLotOfBed() {
        return lotOfBed;
    }

    public void setLotOfBed(int lotOfBed) {
        this.lotOfBed = lotOfBed;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public boolean isBalcon() {
        return IsBalcon;
    }

    public void setBalcon(boolean balcon) {
        IsBalcon = balcon;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
