package com.dawa369.guesstheceleb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ImageManager imageManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        imageManager = new ImageManager("celebs", this.getAssets());
//        ImageView imageView = findViewById(R.id.imageView);
//        imageView.setImageBitmap(imageManager.get(2));

//
//        AssetManager manager = getAssets();
//        try {
//            String[] names = manager.list("celebs");
//            System.out.println(Arrays.toString(names));
//            ImageView imageView = findViewById(R.id.imageView);
//
//            InputStream stream = manager.open("celebs/" + names[2]);
//            Bitmap bitmap = BitmapFactory.decodeStream(stream);
//
//            imageView.setImageBitmap(bitmap);
//        }catch (IOException e){
//            System.out.println("failed to get names");
//        }
    }
}