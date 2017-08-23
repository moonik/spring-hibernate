package Tests.classes;

import app.Application;
import app.model.classes.D;
import app.repository.classes.DclassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = Application.class)
@Transactional
public class DClassTests extends AbstractTestNGSpringContextTests{

    @Autowired
    private DclassRepository dclassRepository;

    @Test
    public void shouldSaveDtest(){
        //given
        D d = new D(addNames(), addNumbers());

        //when
        D savedD = dclassRepository.save(d);

        //then
        Assert.assertNotNull(savedD);

    }

    public List<String> addNames(){
        return Arrays.asList("First", "Second");
    }

    public List<Integer> addNumbers(){
        return Arrays.asList(1,2);
    }

}
