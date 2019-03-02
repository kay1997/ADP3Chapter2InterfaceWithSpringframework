package za.ac.cput;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Configuration.AppConfig;

/*
* Kaylen Abrahams
* Student Number: 216054664
* Group: 3G
*/

public class CarTest {

    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Car bmw = (Car) ctx.getBean("bmw");
    }

    @Test
    public void speed() throws Exception {
        {
            Car bmw = new Bmw();
            int speed = bmw.accelerate(120) - bmw.brake(60);
            Assert.assertEquals(60, speed);
        }
    }
}
