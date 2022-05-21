package com.example.myapplication.api;

import com.example.myapplication.model.Audio;
import com.example.myapplication.model.GetResponse;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @Multipart
    @POST("summons/uploads")
    Call<Audio> uploadAudio(@Part("name") RequestBody name, @Part("date") RequestBody date, @Part("topic") RequestBody topic, @Part MultipartBody.Part audio);

    @GET("read.php")
    Call<GetResponse> readAudioList();
}
