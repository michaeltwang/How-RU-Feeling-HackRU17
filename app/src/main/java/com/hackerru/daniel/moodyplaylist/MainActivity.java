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

import static com.spotify.sdk.android.authentication.LoginActivity.REQUEST_CODE;

public class MainActivity extends Activity //implements SpotifyPlayer.NotificationCallback, ConnectionStateCallback
{


@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

    public void goToSad (View view) {
        Intent intent = new Intent(this, SMSMessage.class);
        startActivity(intent);
    }

    public void goToSleepy (View view) {
        goToUrl ( "http://www.rwjuh.edu/sleepcenter/contactsfl.aspx");
    }

    public void goToHappy (View view) {
        goToUrl ( "https://www.youtube.com/watch?v=TX3wB9lSDj4");
    }
    public void goToLove(View view) {
        goToUrl ( "http://maps.rutgers.edu/location/passion-puddle");

    }
    public void goToUnmotivated(View view) {
        goToUrl ( "https://www.youtube.com/watch?v=oXYMG5LOQ2Q");

    }
    public void goToTriumphant(View view) {
        goToUrl ( "https://www.youtube.com/watch?v=gPp_82l0j6s");

    }
    public void goToEmergency(View view) {
        goToUrl ( "http://rhscaps.rutgers.edu/services/need-help-now/#1450288396557-018d59d0-8ad5");

    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}


