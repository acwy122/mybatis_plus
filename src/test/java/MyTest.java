import com.alibaba.druid.pool.DruidDataSource;
import com.mashibing.bean.Emp;
import com.mashibing.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MyTest {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void test01(){
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
    }

    @Test
    public void test02(){

        EmpDao empDao = context.getBean("empDao", EmpDao.class);
        Emp emp = empDao.selectById(1);
        List<Emp> emps = empDao.selectList(null);
        for (Emp emppp:emps) {
            System.out.println(emppp);
        }


    }

}
