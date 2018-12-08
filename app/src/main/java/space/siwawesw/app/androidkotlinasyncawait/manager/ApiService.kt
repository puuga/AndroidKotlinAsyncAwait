package space.siwawesw.app.androidkotlinasyncawait.manager

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import space.siwawesw.app.androidkotlinasyncawait.model.Repo


interface GitHubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Call<List<Repo>>
}