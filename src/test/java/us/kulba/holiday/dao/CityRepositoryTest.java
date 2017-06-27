package us.kulba.holiday.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

import us.kulba.holiday.model.City;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CityRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(CityRepositoryTest.class);

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void findByName() {

        City city = new City("Ladera Ranch", "CA", "USA", "x, y");
        entityManager.persist(city);
        entityManager.flush();

        City found = cityRepository.findByNameAndCountryAllIgnoringCase("Ladera Ranch", "usa");
        assertThat(found.getName()).isEqualTo("Ladera Ranch");

        logger.info(found.toString());
    }


}
