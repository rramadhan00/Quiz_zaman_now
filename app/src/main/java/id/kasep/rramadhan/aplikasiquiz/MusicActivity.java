package id.kasep.rramadhan.aplikasiquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MusicActivity extends AppCompatActivity {

    Pertanyaan_jawaban modulRR = new Pertanyaan_jawaban();

    TextView pertanyaan_music;
    Button jawabanA,jawabanB,jawabanC,jawabanD;
    Button next;
    Button lihat_score;
    int nomor = 0;
    int score = 0;
    TextView tes_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        pertanyaan_music = (TextView) findViewById(R.id.pertanyaanmusic);
        jawabanA = (Button) findViewById(R.id.buttonA_music);
        jawabanB = (Button) findViewById(R.id.buttonB_music);
        jawabanC = (Button) findViewById(R.id.buttonC_music);
        jawabanD = (Button) findViewById(R.id.buttonD_music);
        next = (Button) findViewById(R.id.next_music);
        next.setVisibility(View.VISIBLE);
        lihat_score = (Button) findViewById(R.id.lihat_score);
        lihat_score.setVisibility(View.GONE);

        ambil_pertanyaan(nomor);
        ambil_pilihan_jawaban(nomor);

        jawabanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jawabanA.getText() == modulRR.ambil_jawaban(nomor)){
                    Toast.makeText(MusicActivity.this, "Anda telah memilih jawaban", Toast.LENGTH_SHORT).show();
                    score += 20;

                } else {

                    Toast.makeText(MusicActivity.this, "Anda telah memilih jawaban", Toast.LENGTH_SHORT).show();
                }

            }
        });

        jawabanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jawabanB.getText() == modulRR.ambil_jawaban(nomor)){
                    Toast.makeText(MusicActivity.this, "Anda telah memilih jawaban", Toast.LENGTH_SHORT).show();
                    score += 20;

                } else {

                    Toast.makeText(MusicActivity.this, "Anda telah memilih jawaban", Toast.LENGTH_SHORT).show();
                }

            }
        });

        jawabanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jawabanC.getText() == modulRR.ambil_jawaban(nomor)){
                    Toast.makeText(MusicActivity.this, "Anda telah memilih jawaban", Toast.LENGTH_SHORT).show();
                    score += 20;

                } else {

                    Toast.makeText(MusicActivity.this, "Anda telah memilih jawaban", Toast.LENGTH_SHORT).show();
                }

            }
        });

        jawabanD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (jawabanD.getText() == modulRR.ambil_jawaban(nomor)){
                    Toast.makeText(MusicActivity.this, "Anda telah memilih jawaban", Toast.LENGTH_SHORT).show();
                    score += 20;

                } else {

                    Toast.makeText(MusicActivity.this, "Anda telah memilih jawaban", Toast.LENGTH_SHORT).show();
                }

            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomor++;
                ambil_pertanyaan(nomor);
                ambil_pilihan_jawaban(nomor);

                if (nomor == 4){

                    next.setVisibility(View.GONE);
                    lihat_score.setVisibility(View.VISIBLE);
                }

                }


        });

        lihat_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String score_string = String.valueOf(score);

                Intent ambil_score = new Intent(MusicActivity.this, ScoreMusicActivity.class);
                ambil_score.putExtra("music",score_string);
                startActivity(ambil_score);
            }
        });

    }

    private void ambil_pertanyaan(int nomor) {
        pertanyaan_music.setText(modulRR.ambil_pertanyaan(nomor));
    }

    private void ambil_pilihan_jawaban(int nomor) {
        jawabanA.setText(modulRR.ambil_pilihan_jawaban1(nomor));
        jawabanB.setText(modulRR.ambil_pilihan_jawaban2(nomor));
        jawabanC.setText(modulRR.ambil_pilihan_jawaban3(nomor));
        jawabanD.setText(modulRR.ambil_pilihan_jawaban4(nomor));
    }


}
