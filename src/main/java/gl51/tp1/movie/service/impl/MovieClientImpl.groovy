package gl51.tp1.movie.service.impl

import gl51.tp1.movie.data.Movie
<<<<<<< HEAD

class MovieClientImpl implements gl51.tp1.movie.service.MovieClient {
=======
import gl51.tp1.movie.service.MovieClient

import javax.inject.Singleton

@Singleton
class MovieClientImpl implements MovieClient {
>>>>>>> master
    @Override
    Movie getMovieDetail(String imdbID) {
        return null
    }
}
