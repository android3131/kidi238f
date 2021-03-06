package com.example.screen4new;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface RetrofitAPI {
    // post

    //mongodb://kidi1:kidi1234@cluster0-shard-00-00.hwayp.mongodb.net:27017,cluster0-shard-00-01.hwayp.mongodb.net:27017,cluster0-shard-00-02.hwayp.mongodb.net:27017/Kidi?ssl=true&replicaSet=atlas-c4n8qa-shard-0&authSource=admin&retryWrites=true&w=majority

    @POST("http://10.0.2.2:8095/createkid")
        //creating a method to post our data.
    Call <List<DataKid>>createPost(@Body DataKid kid);

    @GET("http://10.0.2.2:8095/{getKidWithName}")
    Call <DataKid>createGet(@Path("getKidWithName") String getKidWithName);

    //===================== Example: Multipart Body ======================
    @Multipart
    @POST("/spring-rest/fileserver/singlefileupload/")
    Call<Object> uploadImage(
            @Part MultipartBody.Part file, @Part("file") RequestBody name

    );


}