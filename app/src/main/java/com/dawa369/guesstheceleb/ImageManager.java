package com.dawa369.guesstheceleb;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

public class ImageManager {
    private String assetPath;
    private String[] imageNames;
    private AssetManager assetManager;

    public ImageManager(String assetPath, AssetManager assetManager) {
        this.assetPath = assetPath;
        this.assetManager = assetManager;
        try {
            imageNames = assetManager.list(assetPath);
        } catch (IOException e) {
            e.printStackTrace();
            imageNames = null;
        }
    }

    //given an index, return the bitmap of an index
    Bitmap get(int i){
        try {
            InputStream stream = assetManager.open(assetPath + "/" + imageNames[i]);
            Bitmap bitmap = BitmapFactory.decodeStream(stream);
            stream.close();
            return bitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
