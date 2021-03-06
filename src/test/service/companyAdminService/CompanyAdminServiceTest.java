package service.companyAdminService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by user on 2017/4/14.
 */
public class CompanyAdminServiceTest {

    private CompanyAdminService companyAdminService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-Dao.xml","spring/applicationContext-Service.xml","spring/applicationContext-transaction.xml"});
        companyAdminService= (CompanyAdminService) applicationContext.getBean("companyAdminService");
    }

    @Test
    public void testGetDepartments() throws Exception {
       companyAdminService.getDepartments("2017041516325013");
    }

    @Test
    public void testGetDepartmentAdmin() throws Exception {

        companyAdminService.getDepartmentAdmin("2017041516325013");
    }

    @Test
    public void testGetDepartmentAdmin1() throws Exception {

    }

    @Test
    public void testQueryActivities() throws Exception {
        companyAdminService.queryActivities("1");
    }

    @Test
    public void testQueryNotifies() throws Exception {
        companyAdminService.queryNotifies("1");
    }
}