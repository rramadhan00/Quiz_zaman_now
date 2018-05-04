package id.kasep.rramadhan.aplikasiquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class KategoriActivity extends AppCompatActivity {

    LinearLayout movie;
    LinearLayout music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        movie = (LinearLayout) findViewById(R.id.kategorimovie);
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anjing = new Intent(KategoriActivity.this, MovieActivity.class);
                startActivity(anjing);

            }
        });

        music = (LinearLayout) findViewById(R.id.kategorimusic);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asu = new Intent(KategoriActivity.this, MusicActivity.class);
                startActivity(asu);
            }
        });
    }
}
