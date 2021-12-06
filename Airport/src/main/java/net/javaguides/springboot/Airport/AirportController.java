package net.javaguides.springboot.Airport;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AirportController {
@RequestMapping("/hello")
public Object hello() {
return "Hello World For Airport";
}
}