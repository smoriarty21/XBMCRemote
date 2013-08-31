package com.control.xbmc.xbmcremote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Strict Thread Mode
		StrictMode.ThreadPolicy policy = new StrictMode.
		ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void playButtonClick(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Player.PlayPause\", \"params\": { \"playerid\": 1 }, \"id\": 1}");
	}
	
	public void skipUp(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Player.GoTo\", \"params\": { \"playerid\": 1, \"next\" }, \"id\": 1}");
	}
	
	public void skipDown(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Player.GoTo\", \"params\": { \"playerid\": 1, \"to\":\"previous\" }, \"id\": 1}");
	}
	
	public void fastForward(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Player.SetSpeed\", \"params\": { \"playerid\": 1, \"speed\":\"increment\" }, \"id\": 1}");
	}
	
	public void rewind(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Player.SetSpeed\", \"params\": { \"playerid\": 1, \"speed\":\"decrement\" }, \"id\": 1}");
	}
	
	public void home(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Home\", \"id\": 1}");
	}
	
	public void power(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"System.Shutdown\", \"params\": { \"playerid\": 1 }, \"id\": 1}");
	}
	
	public void up(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Up\", \"id\": 1}");
	}
	
	public void enter(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Select\", \"id\": 1}");
	}
	
	public void right(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Right\", \"id\": 1}");
	}
	
	public void left(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Left\", \"id\": 1}");
	}
	
	public void down(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Input.Down\", \"id\": 1}");
	}
	
	//public void volumeUp(View view) throws Exception{
		//pause.pauseButton();
	//}
	
	//public void volumeDown(View view) throws Exception{
		//pause.pauseButton();
	//}
	
	public void mute(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Application.SetMute\", \"params\": { \"mute\": \"toggle\" }, \"id\": 1}");
	}
	
	public void stop(View view) throws Exception{
		pause.pauseButton("{\"jsonrpc\": \"2.0\", \"method\": \"Player.Stop\", \"params\": { \"playerid\": 1 }, \"id\": 1}");
	}
	
	public void settings(View view) {
		Intent settingsPage = new Intent(view.getContext(), settings.class);
		view.getContext().startActivity(settingsPage);
		}
}
        

