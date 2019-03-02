package za.ac.cput.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import za.ac.cput.Car;

@Configuration
public class AppConfig {

        @Bean(name="bmw")
        public Car getBmw(){
            return new Car() {
                @Override
                public int accelerate(int a) {
                    return 0;
                }

                @Override
                public int brake(int a) {
                    return 0;
                }
            };

        }


}
