package com.example.mastercodingnestedjsonretrofit;

import com.example.mastercodingnestedjsonretrofit.models.SuperModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {

 @GET("v3/e831c143-4fd2-4fcc-a457-a664b0964008")
 Call<SuperModel> getData();

}
