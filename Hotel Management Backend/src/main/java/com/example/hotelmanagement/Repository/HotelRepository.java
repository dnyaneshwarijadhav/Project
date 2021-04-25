package com.example.hotelmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelmanagement.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	

}
