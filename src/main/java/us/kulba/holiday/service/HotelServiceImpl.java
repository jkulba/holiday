package us.kulba.holiday.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import us.kulba.holiday.dao.HotelRepository;
import us.kulba.holiday.model.City;
import us.kulba.holiday.model.Hotel;
import us.kulba.holiday.model.Review;
import us.kulba.holiday.model.ReviewDetails;

import javax.transaction.Transactional;

@Component("hotelService")
@Transactional
public class HotelServiceImpl implements HotelService {
    final Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class);

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel getHotel(City city, String name) {
        return hotelRepository.findByCityAndName(city, name);
    }

    @Override
    public Page<Review> getReviews(Hotel hotel, Pageable pageable) {
        return null;
    }

    @Override
    public Review getReview(Hotel hotel, int index) {
        return null;
    }

    @Override
    public Review addReview(Hotel hotel, ReviewDetails details) {
        return null;
    }

    @Override
    public ReviewsSummary getReviewSummary(Hotel hotel) {
        return null;
    }
}
