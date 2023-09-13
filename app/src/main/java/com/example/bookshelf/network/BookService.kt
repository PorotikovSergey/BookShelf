package com.example.bookshelf.network

import com.example.boolshelf.BookShelf
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {

    @GET("volumes")
    suspend /*значит можно останавливать*/ fun booksearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ): BookShelf
}