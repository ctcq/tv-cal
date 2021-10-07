package de.apps.ctcq.tvcalendar.api;

import de.apps.ctcq.tvcalendar.model.entity.TvShowPage;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TmdbService {

    @GET("search/tv")
    Call<TvShowPage> searchTvShows(
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") String page,
            @Query("query") String query,
            @Query("include_adult") String includeAdult,
            @Query("first_air_date") String firstAirDate
    );

    @GET("tv/{tv_id}")
    Call<TvShowPage> getById(
            Integer tvId
    );
}
