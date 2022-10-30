package com.example.rooms;

public class Room {
    String check_in;
    String check_out;
    int guestNo;

    public Room() {
    }

    public int getGuestNo() {
        return guestNo;
    }

    public void setGuestNo(int guestNo) {
        this.guestNo = guestNo;
    }

    public Room(String check_in, String check_out, int guestNo) {
        this.check_in = check_in;
        this.check_out = check_out;
        this.guestNo = guestNo;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }
}
