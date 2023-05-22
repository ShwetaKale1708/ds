package MyExample.MyWebService;

import org.springframework.web.bind.annotation
	.RestController;
import org.springframework.web.bind.annotation
	.GetMapping;
import org.springframework.web.bind.annotation
	.RequestParam;

@RestController
public class GreetingsController {

	@GetMapping("/hello")
	public HelloResponse greetings(
			// localhost:8080/hello?n=Mars -> name = "Mars"
			// localhost:8080/hello 	   -> name = "World"
			@RequestParam(
				value = "n",
				defaultValue = "World"
			)
			String name
		) {

		HelloResponse res = new HelloResponse();
		res.message = String.format("Hello, %s!!!", name);
		return res;  
	}
	
	class HelloResponse {
		public String message = "";
	}
}
