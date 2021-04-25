import axios from 'axios'

const HOTEL_API_BASE_URL = "http://localhost:1233/api/hotels";

class HotelServices {
    getHotels() {
        return axios.get(HOTEL_API_BASE_URL);
    }
}

export default new HotelServices();