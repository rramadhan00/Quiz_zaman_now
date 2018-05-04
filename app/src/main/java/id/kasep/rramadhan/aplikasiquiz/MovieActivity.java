package id.kasep.rramadhan.aplikasiquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MovieActivity extends AppCompatActivity {

    Pertanyaan_jawaban modulRR = new Pertanyaan_jawaban();

    TextView pertanyaan_movie;
    Button jawabanA,jawabanB,jawabanC,jawabanD;
    Button next;
    Button lihat_score;
    int nomor = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        pertanyaan_movie = (TextView) findViewById(R.id.pertanyaanmovie);
        jawabanA = (Button) findViewById(R.id.buttonA_movie);
        jawabanB = (Button) findViewById(R.id.buttonB_movie);
        jawabanC = (Button) findViewById(R.id.buttonC_movie);
        jawabanD = (Button) findViewById(R.id.buttonD_movie);
        next = (Button) findViewById(R.id.next_movie);
        next.setVisibility(View.VISIBLE);
        lihat_score = (Button) findViewById(R.id.lihat_score);
        lihat_score.setVisibility(View.GONE);

        ambil_pertanyaan(nomor);
        ambil_pilihan_jawaban(nomor);

        jawabanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jawabanA.getText() == modulRR.ambil_jawaban_movie(nomor)){

                    Toast.makeText(MovieActivity.this, "Anda telah memilih jawaban",Toast.LENGTH_SHORT).show();
                    score += 20;

                } else {

                    Toast.makeText(MovieActivity.this, "Anda telah memilih jawaban",Toast.LENGTH_SHORT).show();
                }
            }
        });

        jawabanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jawabanB.getText() == modulRR.ambil_jawaban_movie(nomor)){

                    Toast.makeText(MovieActivity.this, "Anda telah memilih jawaban",Toast.LENGTH_SHORT).show();
                    score += 20;

                } else {

                    Toast.makeText(MovieActivity.this, "Anda telah memilih jawaban",Toast.LENGTH_SHORT).show();
                }
            }
        });

        jawabanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jawabanC.getText() == modulRR.ambil_jawaban_movie(nomor)){

                    Toast.makeText(MovieActivity.this, "Anda telah memilih jawaban",Toast.LENGTH_SHORT).show();
                    score += 20;

                } else {

                    Toast.makeText(MovieActivity.this, "Anda telah memilih jawaban",Toast.LENGTH_SHORT).show();
                }
            }
        });

        jawabanD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jawabanD.getText() == modulRR.ambil_jawaban_movie(nomor)){

                    Toast.makeText(MovieActivity.this, "Anda telah memilih jawaban",Toast.LENGTH_SHORT).show();
                    score += 20;

                } else {

                    Toast.makeText(MovieActivity.this, "Anda telah memilih jawaban",Toast.LENGTH_SHORT).show();
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

                Intent ambil_score = new Intent(MovieActivity.this, ScoreMovieActivity.class);
                ambil_score.putExtra("movie",score_string);
                startActivity(ambil_score);

            }
        });



    }

    private void ambil_pertanyaan(int nomor) {
        pertanyaan_movie.setText(modulRR.ambil_pertanyaan_movie(nomor));
    }

    private void ambil_pilihan_jawaban(int nomor) {
        jawabanA.setText(modulRR.ambil_pilihan_jawaban1_movie(nomor));
        jawabanB.setText(modulRR.ambil_pilihan_jawaban2_movie(nomor));
        jawabanC.setText(modulRR.ambil_pilihan_jawaban3_movie(nomor));
        jawabanD.setText(modulRR.ambil_pilihan_jawaban4_movie(nomor));
    }



}
