package us.kulba.holiday.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import us.kulba.holiday.model.City;
import us.kulba.holiday.model.CitySearchCriteria;
import us.kulba.holiday.model.HotelSummary;


public interface CityService {

    Page<City> findCities(CitySearchCriteria criteria, Pageable pageable);

    City getCity(String name, String country);

    Page<HotelSummary> getHotels(City city, Pageable pageable);

}
