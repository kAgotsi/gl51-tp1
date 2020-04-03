package gl51.tp1.movie.service.impl

import gl51.tp1.movie.data.Movie
import gl51.tp1.movie.service.MovieClient
import spock.lang.Specification

import javax.inject.Inject
import io.micronaut.test.annotation.MicronautTest


@MicronautTest
class MovieClientImplTest extends Specification {

    @Inject
    MovieClient movieClientMock = Mock()

    @Inject
    MovieRegistryImpl registry

    void "Injection should work"() {
        expect:
        movieClientMock != null
        registry != null
    }

    void "Getting a movie by it's imdb ID should work"() {
        when:
        movieClientMock.getMovieDetail("jam")

        then:
        Movie movie = new Movie(imdbId: "jam")
        registry.addMovieToFavorites(movie.imdbId)
        registry.listFavorites().size() == 1
    }
}