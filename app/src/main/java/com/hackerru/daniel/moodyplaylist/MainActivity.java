package com.hackerru.daniel.moodyplaylist;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import com.spotify.sdk.android.authentication.AuthenticationResponse;
import com.spotify.sdk.android.player.Config;
import com.spotify.sdk.android.player.ConnectionStateCallback;
import com.spotify.sdk.android.player.Error;
import com.spotify.sdk.android.player.Player;
import com.spotify.sdk.android.player.PlayerEvent;
import com.spotify.sdk.android.player.Spotify;
import com.spotify.sdk.android.player.SpotifyPlayer;
import com.twitter.sdk.android.core.Twitter;

import static com.spotify.sdk.android.authentication.LoginActivity.REQUEST_CODE;

public class MainActivity extends Activity //implements SpotifyPlayer.NotificationCallback, ConnectionStateCallback
{


@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Twitter.initialize(this);
}

    public void goToSad (View view) {
        setContentView(R.layout.sms_message);
        Intent intent = new Intent(this, SMSMessage.class);
        startActivity(intent);
    }

    public void goToSleepy (View view) {
        goToUrl ( "http://superuser.com/");
    }

    public void goToHappy (View view) {
        goToUrl ( "http://google.com/");
    }
    public void goToLove(View view) {
        goToUrl ( "http://bing.com/");

    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}


