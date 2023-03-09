import network.RandomUserService;
import network.RetrofitClient;
import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class APITest {

    String url =  "https://reqres.in/";

    Integer SUCCESSFUL_RESPONSE = 200;

    @Test
    public void myTest() throws IOException {
        Retrofit retrofit = RetrofitClient.getClient(url);
        RandomUserService service = retrofit.create(RandomUserService.class);

        Response response = service.getUser().execute();

        Assert.assertEquals(response.code(),SUCCESSFUL_RESPONSE);
        Assert.assertNotEquals(response.body(),null);
    }
}
