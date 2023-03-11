import data.SignInRequest;
import network.AuthService;
import network.RetrofitClient;
import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class RealApiTest {

//    /sign-in
    String url =  "https://yoga-new-api.asqq.io/prod/";
    String email = "antonrTest@g.com";
    String password = "123456";
    final String ERROR_INVALID_CREDENTIALS = "Email or password is invalid";


    @Test
    public void signInTest() throws IOException {
        Retrofit retrofit = RetrofitClient.getClient(url);
        AuthService auth = retrofit.create(AuthService.class);

        Response response = auth.signIn(new SignInRequest(email, password)).execute();
        String errorMessage = response.errorBody().string();

        Assert.assertTrue(errorMessage.contains(ERROR_INVALID_CREDENTIALS));
    }
}
