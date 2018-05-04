package id.kasep.rramadhan.aplikasiquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView gambar_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gambar_play = (ImageView) findViewById(R.id.play);
        gambar_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anjing = new Intent(MainActivity.this, KategoriActivity.class);
                startActivity(anjing);
            }
        });


    }
}
