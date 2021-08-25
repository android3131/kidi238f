package com.example.myapplication11;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetroFitAPI {

    //get courses from server
    @GET("getallCourses")
    Call<List<DataModel>> getString();

    @GET("getSpacesCourses")
    Call<List<DataModel>> getSpacesCourses();

    @GET("getAnimalsCourses")
    Call <List<DataModel>> getAnimalsCourses();
    @GET("getArtsCourses")
    Call <List<DataModel>> getArtsCourses();


}
