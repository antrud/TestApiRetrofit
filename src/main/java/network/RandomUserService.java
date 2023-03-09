package network;

import data.Root;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RandomUserService {

//    SINGLE USER /api/users/2

    @GET("api/users/2")
    Call<Root> getUser();
}
