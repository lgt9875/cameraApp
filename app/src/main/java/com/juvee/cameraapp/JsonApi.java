package com.juvee.cameraapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonApi {
    @GET("/test/test3")
    Call<Member> getMember();
}