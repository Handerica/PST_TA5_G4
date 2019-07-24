package com.example.hugoa.trabajoautonomo5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class Video extends YouTubeBaseActivity {


    YouTubePlayerView YT_View;
    Button btn_Play;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        btn_Play = (Button) findViewById(R.id.btn_Play);
        YT_View = (YouTubePlayerView) findViewById(R.id.YT_View);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                List<String> videoList = new ArrayList<>();
                videoList.add("p7bfOZek9t4");
                videoList.add("ASgWBCP7nP0");
                youTubePlayer.loadVideos(videoList);

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };



        //m.youtube.com/watch?v=VIDEO_ID&app=m

    }

    public void volver(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

    public void playVideo(View view){
        YT_View.initialize(YouTubeConfig.getApiKey(), onInitializedListener);
    }
}
