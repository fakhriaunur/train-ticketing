package org.kelompok4.app.Model;

import java.util.ArrayList;

public class CoachModel {
    private int seatQty; // replace with seatQty
    private ArrayList<SeatModel> seat = new ArrayList<SeatModel>();

    public CoachModel(int maxSeat, ArrayList<SeatModel> seat) {
        this.seatQty = maxSeat;
        this.seat = seat;
    }

    public CoachModel() {
    }

    public int getSeatQty() {
        return seatQty;
    }

    public void setSeatQty(int seatQty) {
        this.seatQty = seatQty;
    }

    

    public ArrayList<SeatModel> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<SeatModel> seat) {
        this.seat = seat;
    }
}
