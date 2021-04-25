import React, { Component } from 'react';
import HotelServices from './HotelServices';

class ListHotelComponent extends Component {

    constructor(){
        super();
        this.state={
            hotels : []
        }
    }

    componentDidMount(){
        HotelServices.getHotels().then((res)=>
        {
            this.setState({hotels: res.data});
        });
    }


    render() {
        return (
            <div>
                <h2 className="text-center">Room's Available </h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <tbody>
                            <tr>
                                <th>Room No. </th>
                                <th>Room Type </th>
                                <th>Room Facilities </th>
                                <th>Room Price</th>
                            </tr>
                        </tbody>
                        <tbody>
                            {
                                this.state.hotels.map(
                                    hotels=>
                                    <tr>
                                        <td>{hotels.roomno}</td>
                                        <td>{hotels.roomType}</td>
                                        <td>{hotels.roomFacilities}</td>
                                        <td>{hotels.roomPrice}</td>
                                    </tr>   
                                )
                            }
                        </tbody>    
                    </table>
                </div>
                                    
            </div>
        );
    }
}

export default ListHotelComponent;