package guru.springframework.streamingstockquoteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamingStockQuoteServiceApplication {

	// curl http://localhost:8080/quotes -i -H "Accept: application/json"
	// curl http://localhost:8080/quotes -i -H "Accept: application/x-ndjson"

	public static void main(String[] args) {
		SpringApplication.run(StreamingStockQuoteServiceApplication.class, args);
	}

}
