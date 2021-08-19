package com.example.kidifront;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientGrp2 {

    private static final String BASE_URL = "http://10.0.2.2:8093/";
    private static RetrofitClientGrp2 mInstance;
    private Retrofit retrofit;


    /**
     * a private constructor, singleton class.
     */
    private RetrofitClientGrp2() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    /**
     * a public method that calls the constructor, if still no instance it creates an empty one
     * @return RetrofitClient instance.
     */
    public static synchronized RetrofitClientGrp2 getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitClientGrp2();
        }
        return mInstance;
    }

    /**
     *
     * @return retrofit object, using the API.
     */
    public RetrofitAPIGrp2 getAPI() {
        return retrofit.create(RetrofitAPIGrp2.class);
    }

}
