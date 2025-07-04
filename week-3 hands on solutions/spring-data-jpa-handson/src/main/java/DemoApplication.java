

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // ✅ This method adds data to DB at startup
    @Bean
    public CommandLineRunner loadData(BookRepository repo) {
        return args -> {
            repo.save(new Book("Spring Boot in Action"));
            repo.save(new Book("Pro JPA with Spring"));
        };
    }
}
