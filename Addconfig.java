package javacon.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Addconfig {
@Bean

public Employee employee() {
	Employee ee = new Employee();
	ee.setId(101);
	ee.setName("Artha");
	ee.setSalary(40000);
	return ee;
}
	
}
