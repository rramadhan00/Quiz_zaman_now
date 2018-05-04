package id.kasep.rramadhan.aplikasiquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreMusicActivity extends AppCompatActivity {

    TextView hasil_score;
    Button main_lagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_music);

        hasil_score = (TextView) findViewById(R.id.scoreAngka);
        main_lagi = (Button) findViewById(R.id.mainLagi);

        Intent ambil_score = getIntent();
        String score_music = ambil_score.getStringExtra("music");

        hasil_score.setText(score_music);

        main_lagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainLagi = new Intent(ScoreMusicActivity.this, KategoriActivity.class);
                startActivity(mainLagi);
            }
        });

    }
}
