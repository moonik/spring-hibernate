package Tests;

import app.Application;
import app.model.C;
import app.model.Color;
import app.repository.CclassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.time.LocalDate;

@SpringBootTest(classes = Application.class)
@Transactional
public class CClassTests extends AbstractTestNGSpringContextTests{
    @Autowired
    private CclassRepository cclassRepository;

    @Test
    public void shouldSaveCclassTest(){
        //given
        C c = new C("First", LocalDate.now(), LocalDate.now(), Color.RED);

        //when
        cclassRepository.save(c);

        //then
        C check = cclassRepository.findOne(10L);
        Assert.assertEquals(check.getMyDate(), check.getMyDate2());
    }
}
