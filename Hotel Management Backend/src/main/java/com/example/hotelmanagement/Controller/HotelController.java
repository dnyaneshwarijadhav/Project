package com.example.hotelmanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelmanagement.model.Hotel;
//import com.example.springbootproject.model.Student;
import com.example.hotelmanagement.Repository.HotelRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")

public class HotelController {
	@Autowired
	private HotelRepository hotelrepository;
	@GetMapping("/hotels") 
	public List<Hotel> getAllHotel(){
		return hotelrepository.findAll();
	}
}
