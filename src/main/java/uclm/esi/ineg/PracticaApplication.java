package uclm.esi.ineg;

import javax.xml.ws.Endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uclm.esi.ineg.impl.TaskServiceImpl;

@SpringBootApplication
public class PracticaApplication implements CommandLineRunner {

	@Value("${service.port}")
	private String servicePort;

	@Override
	public void run(String... args) throws Exception {
		Endpoint.publish("http://localhost:" + servicePort
				+ "/service/task", new TaskServiceImpl());
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticaApplication.class, args);
	}
}

