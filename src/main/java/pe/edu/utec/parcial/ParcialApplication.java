package pe.edu.utec.parcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ParcialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParcialApplication.class, args);
    }

}
