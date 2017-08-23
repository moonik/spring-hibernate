package Tests.animal;

import app.Application;
import app.model.Animal.Animal;
import app.model.Animal.Cat;
import app.model.classes.Color;
import app.repository.animal.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = Application.class)
@Transactional
public class AnimalTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private CatRepository catRepository;

    @Test
    public void shouldSaveCatTest(){
        //given
        Animal animal = new Animal("Lion", Color.BLUE);
        Cat cat = new Cat(animal);

        //when
        catRepository.save(cat);

        //then
        Assert.assertNotNull(catRepository.findAll());

    }

}
