package com.example.classa2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService_Interface {

    @GET("007446989.json")
    Call<Mainbook> getMainbookCall();

}
