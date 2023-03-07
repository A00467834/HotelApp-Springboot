package com.springbootassignment.hotelApp.service;

import com.springbootassignment.hotelApp.data.entities.Hotel;
import com.springbootassignment.hotelApp.data.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelService {
    @Autowired
    HotelRepository hotelRepository;
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    public Long addHotel(Hotel hotel) {
        Hotel savedHotel = hotelRepository.save(hotel);
        if (savedHotel != null) {
            return savedHotel.getId();
        } else {
            return -1L;
        }
    }
}
