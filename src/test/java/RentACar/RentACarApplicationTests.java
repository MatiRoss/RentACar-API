package RentACar;

import RentACar.dao.CarDaoImpl;
import RentACar.model.Car;
import RentACar.model.CarList;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class RentACarApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private CarDaoImpl carDao;

    @Test
    public void testAPIGetAllCars() {
        CarList result = this.restTemplate.getForObject("/cars", CarList.class);
        Assertions.assertEquals(result.getCars().size(), carDao.findAll().getCars().size());
    }

    @Test
    public void testAPIGetCarById() {
        Car result = this.restTemplate.getForObject("/cars/1", Car.class);
        System.out.println(result);
        Assertions.assertEquals(result.toString(), carDao.findById(1).toString());
    }




}
