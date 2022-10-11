package HelloWorld;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloController {

    @Get(uri="/", produces="text/plain")

    public String index() {
        return "Hello world";
    }
}