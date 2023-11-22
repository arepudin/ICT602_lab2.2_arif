package com.example.lab22_arep;

import static android.content.Intent.getIntent;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Bundle;

public class FullImageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstaceSate) {
        super.onCreate(savedInstaceSate);
        setContentView(R.layout.full_image);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.thumbImages[position]);

        Toast.makeText(this,"Full view image " + position, Toast.LENGTH_SHORT).show();
    }
}
