package net.javaguides.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FlightBooking {
@RequestMapping("/hello")
public Object hello() {
return "Hello World For Airport";
}
}