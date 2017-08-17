package Tests.vehicle;

import app.Application;
import app.model.classes.Color;
import app.model.vehicle.Bike;
import app.model.vehicle.Car;
import app.repository.vehicle.BikeRepository;
import app.repository.vehicle.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

@SpringBootTest(classes = Application.class)
@Transactional
public class VehicleTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private BikeRepository bikeRepository;

    @Test
    public void saveTest(){
        //given
        Car car = new Car("BMW", Color.RED);
        Bike bike = new Bike(1L);

        //when
        carRepository.save(car);
        bikeRepository.save(bike);

        //then
    }
}
