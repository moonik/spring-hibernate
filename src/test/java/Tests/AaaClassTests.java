package Tests;

import app.Application;
import app.model.Aaa;
import app.model.Bbb;
import app.repository.AaaClassRepository;
import app.repository.BbbClassRepository;
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
        Assert.assertEquals(bbbList.size(), 1);
    }

    public void saveAaa(){
        Aaa aaa = new Aaa();
        aaaClassRepository.save(aaa);
    }
}
