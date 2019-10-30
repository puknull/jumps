package com.jumpcoin.winner.jumper;

import android.content.Context;
import android.content.SharedPreferences;

public class DataBase {
    private static String duel = "jump";
    private SharedPreferences preferences;

    public DataBase(Context context){
        String NAME = "jump";
        preferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
    }

    public void setJump(String data){
        preferences.edit().putString(DataBase.duel, data).apply();
    }

    public String getJump(){
        return preferences.getString(duel, "");
    }
}
