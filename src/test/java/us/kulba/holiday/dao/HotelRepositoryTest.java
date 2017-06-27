package us.kulba.holiday.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import us.kulba.holiday.model.City;
import us.kulba.holiday.model.Hotel;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class HotelRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(HotelRepositoryTest.class);

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Test
    public void findHotelTest() {

        // Find Atlanta City
        City city = cityRepository.findByNameAndCountryAllIgnoringCase("Atlanta", "USA");
        assertThat(city.getName()).isEqualTo("Atlanta");

        Hotel found = hotelRepository.findByCityAndName(city, "Doubletree");
        assertThat(found.getName()).isEqualTo("Doubletree");

        logger.info(found.toString());
    }



}
