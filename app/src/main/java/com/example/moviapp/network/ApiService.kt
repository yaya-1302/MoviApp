import com.example.moviapp.model.GenreResponse
import com.example.moviapp.model.MovieDetailsResponse
import com.example.moviapp.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("genre/movie/list")
    suspend fun getGenres(@Query("api_key") apiKey: String): GenreResponse

    @GET("discover/movie")
    suspend fun discoverMovies(
        @Query("api_key") apiKey: String,
        @Query("with_genres") genreId: String
    ): MovieResponse

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String
    ): MovieDetailsResponse
}
