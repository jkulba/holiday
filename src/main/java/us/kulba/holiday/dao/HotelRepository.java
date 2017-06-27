package us.kulba.holiday.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import us.kulba.holiday.model.City;
import us.kulba.holiday.model.Hotel;
import us.kulba.holiday.model.HotelSummary;
import us.kulba.holiday.model.RatingCount;


public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Hotel findByCityAndName(City city, String name);

    @Query("select new us.kulba.holiday.model.HotelSummary(h.city, h.name, avg(r.rating)) "
            + "from Hotel h left outer join h.reviews r where h.city = ?1 group by h")
    Page<HotelSummary> findByCity(City city, Pageable pageable);

    @Query("select new us.kulba.holiday.model.RatingCount(r.rating, count(r)) "
            + "from Review r where r.hotel = ?1 group by r.rating order by r.rating DESC")
    List<RatingCount> findRatingCounts(Hotel hotel);
}
