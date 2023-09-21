package ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner{
	@Autowired
	private ServiceInterface serviceInterface;

	public static void main(String args[])
	{
	    SpringApplication.run(App.class, args);

	}

	@Override
	public void run(String... args) {
	    serviceInterface.displayMessage();
	    System.out.println(serviceInterface.getServiceName());
	    System.out.println(serviceInterface.serviceName );
	}
	
}
