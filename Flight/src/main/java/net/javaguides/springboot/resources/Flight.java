package net.javaguides.springboot.resources;






import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Flight {
@RequestMapping("/Ashish")
public Object hello() {
return "Atom";
}
}