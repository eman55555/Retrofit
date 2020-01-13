package com.example.eman_hamad.retrofit;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api_Interface {

    @GET("posts/1")
    public Call<Post> getpost();
   // @GET("POSTS")
    //public Call <List<Post>> getpost(@Query("userId") String userId);
    ////
    // @GET("POSTS"/[id])
   //public Call <List<Post>> getpost(@Path("id") int postId);
    ////////////////
  // @POST("posts")
  // public Call<Post> storepost(@Body Post post);
    // public Call<Post> storepost(@Body HashMap<object,object> map);
}
