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
        String video_Url = "rtsp://r6---sn-q4fl6n7y.googlevideo.com/Cj0LENy73wIaNAne9qSXOd-2pxMYDSANFC1rajZdMOCoAUIASARgvOvWu5fa8epbigELejZ4aWo5UlEyM2MM/2ECF48580AEF4C9213BD138E8609888E811FA4BA.298C2FCB635ECF0A240E5B71C4998452112C7B21/yt8/1/video.3gp";
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
