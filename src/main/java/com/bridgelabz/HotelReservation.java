package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    //Creating a List of type Hotel using ArrayList
    private final List<Hotel> hotels;
    public HotelReservation() {
        this.hotels = new ArrayList<Hotel>();
    }
    //create add method with the specified name
    public void add(Hotel hotel) {
        this.hotels.add(hotel);
    }
    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}
