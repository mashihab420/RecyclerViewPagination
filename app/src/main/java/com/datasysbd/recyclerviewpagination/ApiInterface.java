package com.datasysbd.recyclerviewpagination;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

@GET("get_products_withlimit.php")
Call<List> getData(@Query("page")int page,@Query("limit") int limit);

 /*   @GET("v2/list")
    Call<List> getData(
            @Query("page")int page,
            @Query("limit") int limit
    );*/

}
