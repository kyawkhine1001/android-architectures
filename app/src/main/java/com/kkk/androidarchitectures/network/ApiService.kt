package com.kkk.androidarchitectures.network

import com.kkk.androidarchitectures.network.network_response.MovieListResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("bins/1h87n6/")
    fun loadMovieList(): Observable<MovieListResponse>
}