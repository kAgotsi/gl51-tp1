package gl51.tp1.movie.service

import gl51.tp1.movie.data.Movie

/**
 * get movie details from internet
 */
interface MovieClient {
    /**
     * get a movie details from the internet
     * @param imdbID
     * @return
     */
    Movie getMovieDetail(String imdbID)
}