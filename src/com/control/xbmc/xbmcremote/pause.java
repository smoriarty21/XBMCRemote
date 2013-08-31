package com.control.xbmc.xbmcremote;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;


public class pause {
	
	public static void pauseButton(String jsonRequest)
	{
		
		try {
			
			String targetUrl = "http://192.168.1.100:8080/jsonrpc";
			//String jsonRequest = "{\"jsonrpc\": \"2.0\", \"method\": \"Player.PlayPause\", \"params\": { \"playerid\": 1 }, \"id\": 1}";
			
			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(targetUrl);
			
			post.setHeader("Content-Type","application/json");
			
			StringEntity se = new StringEntity(jsonRequest);
			
			//System.out.println(se.toString());
			
			post.setEntity(se);
		
			HttpResponse response = client.execute(post);
			
			BufferedReader read = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			
			System.out.println(read.readLine());
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
			
		
	}		
}
