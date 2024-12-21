package ma.xproce.controlaya;

import ma.xproce.controlaya.dto.BookDto;
import ma.xproce.controlaya.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class ControlAyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlAyaApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BookService bookService) {
		return args -> {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

			bookService.saveBook(
					BookDto.builder().titre("Book Title 1")
							.publisher("Publisher 1")
							.datePublication(dateFormat.parse("2024-12-21"))
							.price(19.99f)
							.resume("Resume of Book 1")
							.build()
			);

			bookService.saveBook(
					BookDto.builder()
							.titre("Book Title 2")
							.publisher("Publisher 2")
							.datePublication(dateFormat.parse("2023-06-15"))
							.price(25.50f)
							.resume("Resume of Book 2")
							.build()
			);
		};
	}
}
