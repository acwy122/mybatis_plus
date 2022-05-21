import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void test01(){
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);


    }

}
