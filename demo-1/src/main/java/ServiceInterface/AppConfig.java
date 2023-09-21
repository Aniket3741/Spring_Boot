package ServiceInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	ServiceInterface serviceInterface()
	{
	    return new ServiceImpl1();
	}
	
}
