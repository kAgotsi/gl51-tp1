package gl51.tp1

import gl51.tp1.movie.data.Movie
import gl51.tp1.movie.data.MovieRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/movie")
class MovieController {

    @Get("/")
    List<Movie> index() {
        []
    }

    @Post('/')
    HttpStatus addMovie(MovieRequest movieRequest) {
        HttpStatus.CREATED
    }
}