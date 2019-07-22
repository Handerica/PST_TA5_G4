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
        String video_Url = "rtsp://r4---sn-q4flrn7d.googlevideo.com/Cj0LENy73wIaNAm0AwCrktgsZhMYDSANFC2PXDVdMOCoAUIASARgvOvWu5fa8epbigELejZ4aWo5UlEyM2MM/DE928892FF7DB612E420CE667D19228BE10E78AB.D5C80A005C3D77C5747E14611C37B3AB6C5DA81E/yt8/1/video.3gp";
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
