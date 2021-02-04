package acme;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAutoConfiguration
@Import({ LoggingConfiguration.class })
public class Application {

	public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	}

}

@Configuration(proxyBeanMethods = false)
class LoggingConfiguration {
    LoggingConfiguration(@Value("${spring.application.name}") String application) {}
}
