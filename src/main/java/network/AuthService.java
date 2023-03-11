package network;

import data.RootProd;
import data.SignInRequest;
import retrofit2.Call;
import retrofit2.http.*;

public interface AuthService {

    @Headers({
            "x-api-key: Yf1FMiI2IK6HV9e7lJxES789JvhKmPaApQGRLjdj",
            "version: 4",
            "platform: 2",
            "language: en",
            "timezone: 2"
    })
    @POST("sign-in")
    Call<RootProd> signIn(@Body SignInRequest signInRequest);
}
