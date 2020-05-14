package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.media.AudioAttributes;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer babyLaughing = MediaPlayer.create(this,R.raw.baby_laughing);
        babyLaughing.start();
        VideoView rabbidVideo=findViewById(R.id.rabbidVideo);
        rabbidVideo.setVideoURI(Uri.parse("android.resource://" +getPackageName() + "/" + R.raw.rabbid));
        rabbidVideo.start();


    }
}
