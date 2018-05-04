package id.kasep.rramadhan.aplikasiquiz;

/**
 * Created by rramadhan on 5/2/18.
 */

public class Pertanyaan_jawaban {

    private String pertanyaan_music [] = {

            "1.Siapa nama vokalis dari band NAIF ?",
            "2.Apa judul lagu terbaru dari Sheila On 7 ?",
            "3.Siapa nama penyanyi yang menjadi istri Hamish ?",
            "4.Salah satu judul lagu dari band OASIS ?",
            "5.Siapa nama gitaris dari band PADI ?"
    };

    private String pilihan_jawaban_music [] [] = {

            {"A.David","B.Andi","C.Bambang","D.Karyo"},
            {"A.Mudah Saja","B.Lapang Dada","C.Film Favorit","D.Sephia"},
            {"A.Nunung","B.Ely Sugigi","C.Raisa","D.Lucinta Luna"},
            {"A.Baik Baik Sayang","B.To Be With You","C.Stay Together","D.Wonderwall"},
            {"A.Once","B.Erros","C.Ahmad Dhani","D.Piyu"}
    };

    private String jawaban_music [] = {

            "A.David",
            "C.Film Favorit",
            "C.Raisa",
            "D.Wonderwall",
            "D.Piyu"
    };

    private String pertanyaan_movie [] = {

            "1.Film terbaru keluaran MARVEL ?",
            "2.Film horror yang menggunakan boneka sebagai objek utama ?",
            "3.Siapa nama aktor dari pemeran Dilan di film Dilan 1990 ?",
            "4.Siapa nama aktris dari pemeran Milea di film Dilan 1990 ?",
            "5.Siapa penulis dan sutradara dari film Dilan 1990 ?"
    };

    private String pilihan_jawaban_movie [] [] = {

            {"A.Spiderman Homecoming","B.Jumanji","C.Ada Apa Dengan Cinta","D.Avengers Infinity War"},
            {"A.Barbie","B.Toys Story","C.Annabel","D.Power Rangers"},
            {"A.Karyo","B.Iqbal","C.Mandra","D.Raditya Dika"},
            {"A.Lucinta Luna","B.Raisa","C.Vanesha","D.Bude Sumiyati"},
            {"A.Pidi Baiq","B.Habiburrahman El Sirazy","C.Rano Karno","D.Raditya Dika"}
    };

    private String jawaban_movie [] = {

            "D.Avengers Infinity War",
            "C.Annabel",
            "B.Iqbal",
            "C.Vanesha",
            "A.Pidi Baiq"
    };

    //ambil pertanyaan, pilihan jawaban, jawaban Music

    public String ambil_pertanyaan (int nomor){
        String pertanyaan = pertanyaan_music[nomor];
        return pertanyaan;
    };

    public String ambil_pilihan_jawaban1 (int nomor){
        String jawaban1 = pilihan_jawaban_music[nomor][0];
        return jawaban1;
    };

    public String ambil_pilihan_jawaban2 (int nomor){
        String jawaban2 = pilihan_jawaban_music[nomor][1];
        return jawaban2;
    };

    public String ambil_pilihan_jawaban3 (int nomor){
        String jawaban3 = pilihan_jawaban_music[nomor][2];
        return jawaban3;
    };

    public String ambil_pilihan_jawaban4 (int nomor){
        String jawaban4 = pilihan_jawaban_music[nomor][3];
        return jawaban4;
    };

    public String ambil_jawaban (int nomor){
        String jawaban_benar = jawaban_music[nomor];
        return jawaban_benar;
    };


    //ambil pertanyaan, pilihan jawaban, jawaban Movie


    public String ambil_pertanyaan_movie (int nomor){
        String pertanyaan = pertanyaan_movie[nomor];
        return pertanyaan;
    };

    public String ambil_pilihan_jawaban1_movie (int nomor){
        String jawaban1 = pilihan_jawaban_movie[nomor][0];
        return jawaban1;
    };

    public String ambil_pilihan_jawaban2_movie (int nomor){
        String jawaban2 = pilihan_jawaban_movie[nomor][1];
        return jawaban2;
    };

    public String ambil_pilihan_jawaban3_movie (int nomor){
        String jawaban3 = pilihan_jawaban_movie[nomor][2];
        return jawaban3;
    };

    public String ambil_pilihan_jawaban4_movie (int nomor){
        String jawaban4 = pilihan_jawaban_movie[nomor][3];
        return jawaban4;
    };

    public String ambil_jawaban_movie (int nomor){
        String jawaban_benar = jawaban_movie[nomor];
        return jawaban_benar;
    };


}
