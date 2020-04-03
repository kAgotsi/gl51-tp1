package gl51.tp1.movie.service.impl

import gl51.tp1.movie.data.Movie
import gl51.tp1.movie.service.MovieClient
import io.micronaut.test.annotation.MockBean
import spock.lang.Specification

import javax.inject.Inject
import io.micronaut.test.annotation.MicronautTest

/**
 */
@MicronautTest
class MovieClientImplTest extends Specification {

    @Inject
    MovieRegistryImpl registry

    void "injection should work"() {
        expect:
        registry != null
    }

    void "favorites should be empty"() {
        expect:
        registry.listFavorites() == []
    }

    void "adding a favorite should fill in the database"() {
        when:
        registry.addMovieToFavorites("aaaaa")
        then:
        registry.listFavorites().size() == 1
        registry.listFavorites().find { it.title == 'my movie'}
    }


    @MockBean(MovieClientImplTest)
    MovieClient movieClient() {
        def mock = Mock(MovieClient)
        mock.getMovieDetail("aaaaa") >> new Movie(imdbID: "aaaaa", title: 'my movie')
        mock
    }
}