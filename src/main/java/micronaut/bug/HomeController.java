package micronaut.bug;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.hibernate.SessionFactory;

import javax.inject.Inject;

@Controller("/")
public class HomeController {

    @Inject
    SessionFactory sessionFactory;

    @Get("/")
    public String index() {
        return "Hello";
    }

}
