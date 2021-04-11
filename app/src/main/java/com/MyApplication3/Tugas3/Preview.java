package com.MyApplication3.Tugas3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class Preview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ImageView img       = findViewById(R.id.image);
        TextView seriesview = findViewById(R.id.series);
        TextView releaseview = findViewById(R.id.release);
        TextView judulview = findViewById(R.id.desc);

        Bundle extras = getIntent().getExtras();

        String images  = extras.getString("IMAGE_KEY");
        String series = extras.getString("NAME_KEY");
        String release = extras.getString("ROLE_KEY");
        String judul = extras.getString("SUMMARY_KEY");

        setTitle("Detail "+ series);

        img.setImageURI(Uri.parse(images));
        Glide.with(this)
            .load(images)
            .into(img);

        seriesview.setText(series);
        releaseview.setText(release);
        judulview.setText(judul);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
