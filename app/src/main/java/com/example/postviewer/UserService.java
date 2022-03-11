package com.example.postviewer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    @GET("api/tutorials?type=json")
    Call<List<UserResponse>> getAllUsers();
}
