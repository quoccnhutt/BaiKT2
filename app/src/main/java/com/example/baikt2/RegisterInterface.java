package com.example.baikt2;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterInterface {

    String REGIURL = "http://192.168.43.204/databasedn/";
    @FormUrlEncoded
    @POST("simpleregister.php")
    Call<String> getUserRegi(
            @Field("username") String username,
            @Field("password") String password,
            @Field("hoten") String hoten
    );

}

