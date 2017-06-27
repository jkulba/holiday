package us.kulba.holiday.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import us.kulba.holiday.model.Hotel;
import us.kulba.holiday.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    Page<Review> findByHotel(Hotel hotel, Pageable pageable);

    Review findByHotelAndIndex(Hotel hotel, int index);

    Review save(Review review);

}
