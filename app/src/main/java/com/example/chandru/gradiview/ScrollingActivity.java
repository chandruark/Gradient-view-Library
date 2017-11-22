package com.example.chandru.gradiview;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.chandru.customgradientview.GradientArtistBasic;

public class ScrollingActivity extends AppCompatActivity {

    GradientArtistBasic gradient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        gradient=(GradientArtistBasic) findViewById(R.id.gradientImage);
       gradient.setUrlImage("https://plus.google.com/photos/116790965176004270369/albums/profile/6209423768673413858?iso=false",R.drawable.weather,
              R.drawable.weather, ImageView.ScaleType.CENTER_CROP);
        gradient.setDrawableImage(R.drawable.fun1,R.drawable.weather,R.drawable.weather,
                ImageView.ScaleType.CENTER_CROP);
        Drawable myGradient = ContextCompat.getDrawable(this,R.drawable.alpha_gradient);
        gradient.setGradient(myGradient);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}