package us.kulba.holiday.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import us.kulba.holiday.model.City;
import us.kulba.holiday.model.Hotel;
import us.kulba.holiday.model.Review;
import us.kulba.holiday.model.ReviewDetails;


public interface HotelService {

    Hotel getHotel(City city, String name);

    Page<Review> getReviews(Hotel hotel, Pageable pageable);

    Review getReview(Hotel hotel, int index);

    Review addReview(Hotel hotel, ReviewDetails details);

    ReviewsSummary getReviewSummary(Hotel hotel);

}
