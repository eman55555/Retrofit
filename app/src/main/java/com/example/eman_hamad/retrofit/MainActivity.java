package com.example.eman_hamad.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView=findViewById(R.id.post_title_tv);
       // Post post=new Post(5,"EMAN","HAMAD");
       /* HashMap<object, object>map=new HashMap<object, object>();
        map.put("title","emoooooo");
        map.put("body","this is my scond tense");
        map.put("userId",5) ;*/
        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        Api_Interface api_interface=retrofit.create(Api_Interface.class);

        Call<Post> call=api_interface.getpost();
        //Call<Post> call=api_interface.storepost(post);
       //Call<Post> call=api_interface.storepost(map);
       // Call<Post>List<post> call=api_interface.getpost(userid:"1");
        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                textView.setText(response.body().getTitle());
              //  textView.setText(response.body().get(0).getTitle());
                

            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                textView.setText(t.getMessage());

            }
        });
    }

}
