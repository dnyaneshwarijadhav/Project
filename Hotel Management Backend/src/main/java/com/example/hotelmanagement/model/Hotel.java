package com.example.hotelmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoteltable")
public class Hotel {
	
	
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column(name = "roomno")
		private int roomno;
		
		@Column(name="RoomType")
		private String RoomType;
		
		@Column(name="RoomPrice")
		private float RoomPrice;
		
		@Column(name="RoomFacilities")
		private String RoomFacilities;

		public int getRoomno() {
			return roomno;
		}

		public void setRoomno(int roomno) {
			this.roomno = roomno;
		}

		public String getRoomType() {
			return RoomType;
		}

		public void setRoomType(String roomType) {
			this.RoomType = roomType;
		}

		public float getRoomPrice() {
			return RoomPrice;
		}

		public void setRoomPrice(float roomPrice) {
			this.RoomPrice = roomPrice;
		}

		public String getRoomFacilities() {
			return RoomFacilities;
		}

		public void setRoomFacilities(String roomFacilities) {
			this.RoomFacilities = roomFacilities;
		}
		
		
}
