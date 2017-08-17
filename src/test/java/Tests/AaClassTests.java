package Tests;

import app.Application;
import app.model.Aa;
import app.model.Bb;
import app.repository.AaClassRepository;
import app.repository.BbClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = Application.class)
@Transactional
public class AaClassTests extends AbstractTestNGSpringContextTests{
    @Autowired
    private AaClassRepository aaClassRepository;
    @Autowired
    private BbClassRepository bbClassRepository;

    @Test
    public void shouldSaveAaTest(){
        //given
        Aa aa = new Aa();
        Bb bb = new Bb();

        //when
        aa.setBb(bb);
        bb.setAa(aa);
        aaClassRepository.save(aa);

        //then
        Assert.assertNotNull(aaClassRepository.findAll());
        Assert.assertNotNull(bbClassRepository.findAll());
    }
}
