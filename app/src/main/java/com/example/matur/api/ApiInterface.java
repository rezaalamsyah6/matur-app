package com.example.matur.api;

import com.example.matur.model.GetLaporan;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @GET("laporan")
    Call<GetLaporan> getKontak(@Field("deskripsi") String deskripsi,
                               @Field("kategori") String kategori,
                               @Field("status") String status);

}
