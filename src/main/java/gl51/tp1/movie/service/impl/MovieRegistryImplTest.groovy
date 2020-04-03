package gl51.tp1.movie.service.impl

import spock.lang.Specification

import javax.inject.Inject

class MovieRegistryImplTest extends Specification {

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

    void "adding a facovite should fill in the database"() {
        when:
        registry.addMovieToFavorites("aaaaa")
        then:
        registry.listFavorites().size() == 1
    }
}
