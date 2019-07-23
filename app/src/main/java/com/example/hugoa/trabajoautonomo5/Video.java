package com.example.hugoa.trabajoautonomo5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView video_View = (VideoView) findViewById(R.id.video_View);
        String video_Url = "rtsp://r2---sn-q4fl6n7e.googlevideo.com/Cj0LENy73wIaNAmFN2T21wvqGxMYDSANFC2MajddMOCoAUIASARgvOvWu5fa8epbigELejZ4aWo5UlEyM2MM/448F6765A08AC4119B5DCBAB15BD281019945C90.D5C813BB43F7A266A9BCE0600F5FE482341A2009/yt8/1/video.3gp";
        Uri uri = Uri.parse(video_Url);
        video_View.setMediaController(new MediaController(this));
        video_View.setVideoURI(uri);
        video_View.requestFocus();
        video_View.start();

        //m.youtube.com/watch?v=VIDEO_ID&app=m

    }

    public void volver(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
