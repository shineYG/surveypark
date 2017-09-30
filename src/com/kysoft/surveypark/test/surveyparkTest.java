package com.kysoft.surveypark.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 上午9:31
 * To change this template use File | Settings | File Templates.
 */
public class surveyparkTest {

    @Test
    public void testDataSource(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        DataSource dataSource = (DataSource) ac.getBean("dataSource");
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
