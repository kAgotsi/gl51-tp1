package gl51.tp1;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/movie")
public class MovieController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}