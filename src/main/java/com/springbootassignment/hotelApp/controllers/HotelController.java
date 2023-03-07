package com.springbootassignment.hotelApp.controllers;

import com.springbootassignment.hotelApp.data.entities.Hotel;
import com.springbootassignment.hotelApp.service.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class HotelController {
    @Autowired
    HotelService hotelService;
    private static final Logger logger = LoggerFactory.getLogger(HotelController.class);
    @GetMapping(path="/getHotels")
    public ResponseEntity getHotels() {
        List<Hotel> hotels = hotelService.getHotels();
        return ResponseEntity.ok(hotels);
    }

    @PostMapping(path="/addHotel", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addHotel(@RequestBody Hotel hotel) {
        if (hotelService.addHotel(hotel) >= 0) {
            return ResponseEntity.ok("Hotel Added Successfully\n" +  hotel);
        } else {
            return new ResponseEntity("Error while adding hotel", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
