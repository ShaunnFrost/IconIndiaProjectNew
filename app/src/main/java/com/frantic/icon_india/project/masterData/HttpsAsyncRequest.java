package com.ankur.taskapp.manager.masterData;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

import dmax.dialog.SpotsDialog;

/**
 * Created by DESIGNER-PC1 on 8/14/2017.
 */

public class HttpsAsyncRequest extends AsyncTask<String, Void, JSONObject> {
    private static final String HTTPS_STRING = "https";
    android.app.AlertDialog alertDialog;

    /**
     * https://developers.google.com/maps/documentation/geocoding/
     * https://developers.google.com/url-shortener/v1/getting_started?csw=1#shorten
     */
    String REST_SERVER_HTTPS_GET_URI = "https://maps.googleapis.com/maps/api/geocode/json?address=NewDelhi,India";
    String REST_SERVER_HTTPS_POST_URI = "https://www.googleapis.com/urlshortener/v1/url";
    String REST_SERVER_HTTPS_POST_URI1="https://gat.cairnindia.com/api/login";
    JSONObject jsonObject;
    Context context;
    CallBackInterface listner;
    protected ProgressDialog progressDialog;

    public HttpsAsyncRequest(Context context, CallBackInterface listner)
    {
        this.context=context;
        this.listner=listner;
        alertDialog = new SpotsDialog(context);
       // progressDialog=new ProgressDialog(context,ProgressDialog.THEME_HOLO_LIGHT);

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        alertDialog.setTitle("Please Wait");
        alertDialog.setMessage("logging...");
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
    @Override
    protected JSONObject doInBackground(String... params) {
        String responseString = "";

        HttpClient httpClient = HTTPUtils.getNewHttpClient(REST_SERVER_HTTPS_POST_URI1.startsWith(HTTPS_STRING));
        HttpResponse response = null;
        InputStream in;
        URI newURI = URI.create(REST_SERVER_HTTPS_POST_URI1);
        HttpPost postMethod = new HttpPost(newURI);

        try {
            JSONObject postJSON = new JSONObject();
            postJSON.put("deviceId",params[0]);
            postJSON.put("username",params[1]);
            postJSON.put("password",params[2]);
            Log.e("request",postJSON+"");
            postMethod.setEntity(new StringEntity(postJSON.toString(), HTTP.UTF_8));
            postMethod.setHeader("Content-Type", "application/json");
            response = httpClient.execute(postMethod);
            in = response.getEntity().getContent();
            responseString = convertStreamToString(in);
             jsonObject=new JSONObject(responseString);
        } catch (Exception e) {}
        return jsonObject;
    }

    @Override
    protected void onPostExecute(JSONObject jsonObject) {
        super.onPostExecute(jsonObject);
        try {
            listner.callBackResponse(jsonObject);
            if(alertDialog.isShowing())
                alertDialog.dismiss();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static String convertStreamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        is.close();
        return sb.toString();
    }
    public interface  CallBackInterface{
        void callBackResponse(JSONObject obj) throws JSONException;
    }

    //get
   /* public String getRequest() {
        String responseString = "";
        HttpClient httpClient = HTTPUtils.getNewHttpClient(REST_SERVER_HTTPS_GET_URI.startsWith(HTTPS_STRING));
        HttpResponse response = null;
        InputStream in;
        URI newURI = URI.create(REST_SERVER_HTTPS_GET_URI);
        HttpGet getMethod = new HttpGet(newURI);
        try {
            response = httpClient.execute(getMethod);
            in = response.getEntity().getContent();
            responseString = convertStreamToString(in);
        } catch (Exception e) {}
        return responseString;
    }*/
}
