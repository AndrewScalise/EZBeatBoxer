package com.skuhleesi.ezbeatboxer;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mugen on 1/26/2017.
 */

public class SignupRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://skuhleesi.000webhostapp.com/Signup.php";
    private Map<String, String> params;

    public SignupRequest(String email, String username, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);

        //Have volley pass information to request
        params = new HashMap<>();
        params.put("email", email);
        params.put("username", username);
        params.put("password", password);
    }

    //will get params and pass to volley
    @Override
    public Map<String, String> getParams(){
        return params;
    }

}
