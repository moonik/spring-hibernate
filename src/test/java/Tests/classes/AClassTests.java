package Tests.classes;

import app.Application;
import app.model.classes.A;
import app.model.classes.B;
import app.repository.classes.AclassRepository;
import app.repository.classes.BclassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = Application.class)
@Transactional
public class AClassTests extends AbstractTestNGSpringContextTests {
    @Autowired
    private AclassRepository aclassRepository;
    @Autowired
    private BclassRepository bclassRepository;

    @Test
    public void shouldSaveAtest(){
        //given
        A a = new A();
        B b = new B();

        //when
        a.setB(b);
        A a1 = aclassRepository.save(a);

        //then
        Assert.assertNotNull(aclassRepository.findAll());
        Assert.assertNotNull(bclassRepository.findAll());

    }
}
