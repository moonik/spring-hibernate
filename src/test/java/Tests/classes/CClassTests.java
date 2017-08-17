package Tests.classes;

import app.Application;
import app.model.classes.C;
import app.model.classes.Color;
import app.repository.classes.CclassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.Collection;

@SpringBootTest(classes = Application.class)
@Transactional
public class CClassTests extends AbstractTestNGSpringContextTests{
    @Autowired
    private CclassRepository cclassRepository;
    @PersistenceContext
    private EntityManager entityManager;

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

    @Test
    public void task5Atest(){
        //given
        C first = new C("ASFD", LocalDate.now(), LocalDate.now(), Color.RED);
        C second = new C("ASFD2", LocalDate.now(), LocalDate.now(), Color.RED);

        //then
        cclassRepository.save(first);
        cclassRepository.save(second);

        //then
        Assert.assertNotNull(cclassRepository.findAll());
    }

    @Test
    public void task5Btest(){
        //given

        //when
        Integer amount = cclassRepository.countObjects();
        Integer amount2 = entityManager.createQuery("select COUNT(c) from C c").getFirstResult();

        //then
        assert amount < 3;
        assert amount2 < 3;
        assert cclassRepository.findAll().size() < 3;
    }

    @Test
    public void task5Ctest(){
        //given
        String name = "ASFD";

        //when
        Integer amount = cclassRepository.countObjectsByName(name);
        Collection<C> col1 = cclassRepository.getAllByName(name);
        Collection<C> col2 = cclassRepository.findByName(name);

        //then
        assert amount < 2;
        assert col1.size() < 2;
        assert col2.size() < 2;
    }
}
