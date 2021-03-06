package Tests.classes;

import app.Application;
import app.model.classes.Aaa;
import app.model.classes.Bbb;
import app.repository.classes.AaaClassRepository;
import app.repository.classes.BbbClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

@SpringBootTest(classes = Application.class)
@Transactional
public class AaaClassTests extends AbstractTestNGSpringContextTests{
    @Autowired
    private AaaClassRepository aaaClassRepository;
    @Autowired
    private BbbClassRepository bbbClassRepository;

    @Test
    public void shouldSaveAaaAndBbbTest(){
        //given
        saveAaa();
        Bbb bbb = new Bbb();
        Aaa aaa = aaaClassRepository.findAll().get(0);

        //when
        List<Bbb> bbbList = aaa.getBbb();
        bbbList.add(bbb);
        bbbList = bbbClassRepository.save(bbbList);

        //then
        Assert.assertNotNull(bbbList);
        Assert.assertEquals(bbbList.size(), 2);
    }

    public void saveAaa(){
        aaaClassRepository.save(new Aaa());
    }
}
