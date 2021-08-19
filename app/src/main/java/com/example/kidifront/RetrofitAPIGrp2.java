package com.example.kidifront;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPIGrp2 {


    /**
     * posts a new parent
     * @param parent , the parent to be added
     * @return a list of parents.
     */
    @POST("createParent")
    //creating a method to post our data.
    Call<List<com.example.kidifront.ParentGrp2>> createPost(@Body com.example.kidifront.ParentGrp2 parent);


    /**
     * posts a new kid
     * @param my_kid , the kid to be added
     * @return list of kids.
     */
    @POST("createKid")
    Call<List<com.example.kidifront.KidGrp2>> createKid(@Body com.example.kidifront.KidGrp2 my_kid);

}



