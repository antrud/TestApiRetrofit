package data;

import com.google.gson.annotations.SerializedName;

public class SignInRequest {

    @SerializedName("email")
    public String email;

    @SerializedName("password")
    public String password;

    public SignInRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
