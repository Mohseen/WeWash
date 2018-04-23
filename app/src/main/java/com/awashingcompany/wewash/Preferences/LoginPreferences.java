package com.awashingcompany.wewash.Preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.awashingcompany.wewash.Models.User;

import org.json.JSONException;

public class LoginPreferences {

    private static final String USERTABLE = "usertable";
    private static final String IS_LOGGED_IN = "isLoggedIn";
    private static final String EMAIL = "email";
    private static final String MOBILE = "mobile";

    SharedPreferences preferences;
    Context context;

    public LoginPreferences(Context context){
        preferences = context.getSharedPreferences(USERTABLE,Context.MODE_PRIVATE);
        this.context = context;
    }


    public boolean isLoggedIn(){
        return preferences.getBoolean(IS_LOGGED_IN, false);
    }

    public User getUser() {
        String email = preferences.getString(EMAIL,"");
        String mobile = preferences.getString(MOBILE,"");
        return new User(email,mobile);
    }


    public void loginUser(User user) throws JSONException {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(IS_LOGGED_IN, true);
        editor.putString(EMAIL, user.getEmail());
        editor.putString(MOBILE, user.getMobile());
        editor.apply();
    }

    public void logoutUser(){
        if(preferences.getBoolean(IS_LOGGED_IN, false)) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear();
            editor.apply();
            editor.putBoolean(IS_LOGGED_IN, false);
            editor.apply();
        }
    }


}
