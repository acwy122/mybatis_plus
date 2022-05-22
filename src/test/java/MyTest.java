import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
        //Emp emp = empDao.selectById(1);
        List<Emp> emps = empDao.selectList(null);
        for (Emp emppp:emps) {
            System.out.println(emppp);
        }
    }
    @Test
    public void test03(){
        EmpDao empDao = context.getBean("empDao", EmpDao.class);
        Emp emp = new Emp();
        emp.setEname("lisi");
        emp.setDeptno(1);
        emp.setJob("fasdfa");
        int insert = empDao.insert(emp);
        System.out.println(insert);

    }

    @Test
    public void test04(){
        EmpDao empDao = context.getBean("empDao", EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(555);
        emp.setEname("lisi");
        emp.setDeptno(1);
        emp.setJob("646465");
        int insert = empDao.updateById(emp);
        System.out.println(insert);

    }

    @Test
    public void test05(){

        //在使用分页的时候，必须添加一个插件com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
        EmpDao empDao = context.getBean("empDao", EmpDao.class);
//        Page<Emp> empPage = empDao.selectPage(new Page<Emp>(2,2),null);
//        System.out.println(empPage.getRecords());

        List<Emp> emps = empDao.selectEmpByList();
        System.out.println(emps);

    }

    @Test
    public void test06(){
        QueryWrapper wrapper = new QueryWrapper();
    }

}
