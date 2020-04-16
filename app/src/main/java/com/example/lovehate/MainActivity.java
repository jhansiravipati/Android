package com.example.lovehate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2;
    private ImageView iv1,iv2;
    private int[] love_images = {R.drawable.love1,R.drawable.love2,R.drawable.love3,R.drawable.love4};
    private int[] hate_images = {R.drawable.hate1,R.drawable.hate2,R.drawable.hate3,R.drawable.hate4};
    private int loveimage=0;
    private int hateimage=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.i1).setVisibility(View.VISIBLE);
        findViewById(R.id.i2).setVisibility(View.VISIBLE);
        findViewById(R.id.loveb).setOnClickListener(b1Changeloveimage);
        findViewById(R.id.hateb).setOnClickListener(b2Changehateimage);


    }

    View.OnClickListener b1Changeloveimage = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            loveimage++;
            loveimage= loveimage%love_images.length;
            iv1.setImageResource(love_images[loveimage]);
        }
    };

    View.OnClickListener b2Changehateimage = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            hateimage++;
            hateimage = hateimage % hate_images.length;
            iv2.setImageResource(hate_images[hateimage]);
        }
    };
}
