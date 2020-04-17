package gl51.tp1.movie.service.impl

import gl51.tp1.movie.data.Movie
import gl51.tp1.movie.service.MovieClient
import gl51.tp1.movie.service.MovieRegistry

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRegistryImpl implements MovieRegistry {

    private List<Movie> internalRegistry = []

    @Inject
    private MovieClient movieClient

    @Override
    void addMovieToFavorites(String imdbID) {
        internalRegistry << movieClient.getMovieDetail(imdbID)
    }

    @Override
    List<Movie> listFavorites() {
        internalRegistry
    }
}
