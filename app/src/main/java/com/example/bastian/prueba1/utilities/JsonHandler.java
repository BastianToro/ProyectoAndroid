package com.example.bastian.prueba1.utilities;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by bastian on 29-05-16.
 */
public class JsonHandler {

    public String [] getMailPass(String usuario) {
        try{
            JSONArray ja = new JSONArray(usuario);
            String[] result = new String[ja.length()];
            String user;
            for(int i=0; i<ja.length();i++){
                JSONObject row = ja.getJSONObject(i);
                user =" " + row.getString("correoUsuario")+" "+row.getString("contrasenhaUsuario");
                result[i]=user;
            }
            return result;

        }catch(JSONException e){
            Log.e("Error",this.getClass().toString());
        }
        return null;

    }// getMailPass(String actors)
}
