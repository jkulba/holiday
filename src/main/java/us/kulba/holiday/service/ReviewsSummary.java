package us.kulba.holiday.service;

import us.kulba.holiday.model.Rating;

public interface ReviewsSummary {

    long getNumberOfReviewsWithRating(Rating rating);

}
