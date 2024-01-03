package com.example.deliveryapp.data;

import com.example.deliveryapp.model.LoginRequest;
import com.example.deliveryapp.model.TokenResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServices {
    @POST("auth/login")
    Call<TokenResponse> loginUser(@Body LoginRequest request);

}
