package Tests.company;

import app.Application;
import app.model.company.Company;
import app.model.company.Employee;
import app.repository.company.CompanyRepository;
import app.repository.company.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

@SpringBootTest(classes = Application.class)
@Transactional
public class CompanyTests extends AbstractTestNGSpringContextTests{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @Test
    public void shouldSaveEmployeeTest(){
        //given
        Employee employee = new Employee("Lana", "director", 1000);

        //when
        employeeRepository.save(employee);

        //then
        Assert.assertNotNull(employeeRepository.findAll());
    }

    public Company saveCompany(){
        return companyRepository.save(new Company("SAMSUNG"));
    }

}
