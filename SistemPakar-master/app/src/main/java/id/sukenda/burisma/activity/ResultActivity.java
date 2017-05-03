package id.sukenda.burisma.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import id.sukenda.burisma.R;
import id.sukenda.burisma.model.Pertanyaan;

/**
 * Created by sukenda on 9/11/16.
 * Project SistemPakar
 * <p>
 * Copyright 2016  sukenda (soekenda09@gmail.com)
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
public class ResultActivity extends AppCompatActivity {

    private boolean doubleBackClick = false;
    private TextView textViewResult;
    private TextView textViewSolusion;
    private TextView textViewLink;
    private ImageView imageViewNotFound;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setTitle("");

        textViewLink = (TextView) findViewById(R.id.text_link);
        textViewResult = (TextView) findViewById(R.id.text_hasil);
        textViewSolusion = (TextView) findViewById(R.id.text_solusi);
        imageViewNotFound = (ImageView) findViewById(R.id.image_not_found);
        imageViewResult = (ImageView) findViewById(R.id.image_result);

        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("Mohon Tunggu...");
        dialog.setCancelable(false);
        dialog.setInverseBackgroundForced(false);
        dialog.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Pertanyaan pertanyaan = (Pertanyaan) getIntent().getSerializableExtra("pertanyaan");
                if (pertanyaan != null) {
                    resultExpert(pertanyaan);
                }

                dialog.dismiss();
            }
        }, 2000);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackClick) {
            super.onBackPressed();
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);
        }

        this.doubleBackClick = true;
        Toast.makeText(this, "Tekan sekali lagi jika sudah selesai", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackClick = false;
            }
        }, 2000);
    }

    private void resultExpert(Pertanyaan param) {
        /**
         * ROLE
         * R1 = IF G4 AND G6 THEN P1
         * R2 = IF G4 AND G7 THEN P2
         * R3 = IF G4 THEN P3
         * R4 = IF G8 THEN P4
         * R5 = IF G1 AND G10 THEN P5
         * R6 = IF G9 THEN P6
         * R7 = IF G4 AND G5 THEN P7
         * R8 = IF G2 AND G11 THEN P8
         *
         * PENYAKIT / JAWABAN
         * P1 = Kabel terputus
         * P2 = Kapasitor motor rusak
         * P3 = Floot klep pipa hisap bocor
         * P4 = Pipa transmisi bocor
         * P5 = Bering motor rusak
         * P6 = Automatik pompa air rusak
         * P7 = Spoel motor terbakar
         * P8 = Laker motor rusak / sudah longgar
         */

        if (!param.isJawaban1() && !param.isJawaban2() && !param.isJawaban3()
                && param.isJawaban4() && !param.isJawaban5() && param.isJawaban6()
                && !param.isJawaban7() && !param.isJawaban8() && !param.isJawaban9()
                && !param.isJawaban10() && !param.isJawaban11()) {
            /** Jawaban nomor P1
             * R1 = IF G4 AND G6 THEN P1 */
            textViewResult.setText("Kabel Pompa Air terputus");
            textViewSolusion.setText("Lakukan penyambungan ulang kabel yang terputus sesuai dengan prosedur penyambungan kabel, perhatikan fisik kabel, \napabila menggunakan kabel serabut dan saat dikupas serabut kabel sudah berwarna hitam disarankan kabel penghantar untuk diganti baru, karena daya hantar kabel tersebut sudah tidak baik.");

            imageViewResult.setVisibility(View.VISIBLE);
            imageViewResult.setImageResource(R.drawable.kabel_terputus);

        } else if (!param.isJawaban1() && !param.isJawaban2() && !param.isJawaban3()
                && param.isJawaban4() && !param.isJawaban5() && !param.isJawaban6()
                && param.isJawaban7() && !param.isJawaban8() && !param.isJawaban9()
                && !param.isJawaban10() && !param.isJawaban11()) {
            /** Jawaban nomor P2
             * R2 = IF G4 AND G7 THEN P2 */
            textViewResult.setText("Kapasitor pompa air anda rusak");
            textViewSolusion.setText("Perhatikan: jangan gunakan capasitor yg tidak sama dengan seri kapasitor aslinya karena aka biasa memicu kerusakan pada bagian yang lain.");

            textViewLink.setVisibility(View.VISIBLE);
            textViewLink.setText("Untuk Informasi lebih lengkap silakan kunjungi link berikut : \nhttps://goo.gl/46UvQZ");

            imageViewResult.setVisibility(View.VISIBLE);
            imageViewResult.setImageResource(R.drawable.kapasitor_rusak);

        } else if (!param.isJawaban1() && !param.isJawaban2() && !param.isJawaban3()
                && param.isJawaban4() && !param.isJawaban5() && !param.isJawaban6()
                && !param.isJawaban7() && !param.isJawaban8() && !param.isJawaban9()
                && !param.isJawaban10() && !param.isJawaban11()) {
            /** Jawaban nomor P3
             * R3 = IF G4 THEN P3 */
            textViewResult.setText("Floot klep pipa hisap bocor");
            textViewSolusion.setText("Lakukan pengangkatan pompa untuk bisa mengetahui kondisi foot klep karena letaknya ada di bagian paling bawah pipa hisapkemudian bersihkan klep dari sombatan kotoran dan ganti yang baru apabila terjadi kerusakan pada klep tersebut");

            imageViewResult.setVisibility(View.VISIBLE);
            imageViewResult.setImageResource(R.drawable.floot_klep_pipa_air);

        } else if (!param.isJawaban1() && !param.isJawaban2() && !param.isJawaban3()
                && !param.isJawaban4() && !param.isJawaban5() && !param.isJawaban6()
                && !param.isJawaban7() && param.isJawaban8() && !param.isJawaban9()
                && !param.isJawaban10() && !param.isJawaban11()) {
            /** Jawaban nomor P4
             * R4 = IF G8 THEN P4 */
            textViewResult.setText("Pipa transmisi bocor");
            textViewSolusion.setText("Periksa sambungan pipa hisap apabila terjadi kebocoran pada pipa lakukan penyambungan ulang dengan dipotong dan diadakan pengeleman ulang");

            imageViewResult.setVisibility(View.VISIBLE);
            imageViewResult.setImageResource(R.drawable.pipa_transmisi);

        } else if (param.isJawaban1() && !param.isJawaban2() && !param.isJawaban3()
                && !param.isJawaban4() && !param.isJawaban5() && !param.isJawaban6()
                && !param.isJawaban7() && !param.isJawaban8() && !param.isJawaban9()
                && param.isJawaban10() && !param.isJawaban11()) {
            /** Jawaban nomor P5
             * R5 = IF G1 AND G10 THEN P5 */
            textViewResult.setText("Bering motor pompa air mengalami kerusakan");
            textViewSolusion.setText("Lakukan pembokaran pompa dengan menggunakan peralatan yang lengkap kemudian ganti bering yang rusak karena biasanya sudah tidak bisa digunakan lagi hubungi teknisi apabila kesulitan dalam melakukan pekerjaan ini karena melepas bering membutuhkan keahlian khusus.");

            imageViewResult.setVisibility(View.VISIBLE);
            imageViewResult.setImageResource(R.drawable.bering_pompa_air);

        } else if (!param.isJawaban1() && !param.isJawaban2() && !param.isJawaban3()
                && !param.isJawaban4() && !param.isJawaban5() && !param.isJawaban6()
                && !param.isJawaban7() && !param.isJawaban8() && param.isJawaban9()
                && !param.isJawaban10() && !param.isJawaban11()) {
            /** Jawaban nomor P6
             *  R6 = IF G9 THEN P6 */
            textViewResult.setText("Automatik pompa air rusak");
            textViewSolusion.setText("Perika pelampung yang ada didalam water torn biasanya pelampung tidak kembali menggantung sesuai desain setelah water toren dipenui air atau swit automatik kelebian arus biasanya akan mengakibatkan terbakarnya swit tersebut.");

            imageViewResult.setVisibility(View.VISIBLE);
            imageViewResult.setImageResource(R.drawable.automatik_pompa_air);

        } else if (!param.isJawaban1() && !param.isJawaban2() && !param.isJawaban3()
                && param.isJawaban4() && param.isJawaban5() && !param.isJawaban6()
                && !param.isJawaban7() && !param.isJawaban8() && !param.isJawaban9()
                && !param.isJawaban10() && !param.isJawaban11()) {
            /** Jawaban nomor P7
             * R7 = IF G4 AND G5 THEN P7 */
            textViewResult.setText("Spoel motor terbakar");
            textViewSolusion.setText("Lakukan penyepulan ulang pada spoel staor ; pada tingkat kerusakan seperti ini biasanya diserahkan para tehnisi yang berkemampuan khusu di bidang penyepulan motor.");

            imageViewResult.setVisibility(View.VISIBLE);
            imageViewResult.setImageResource(R.drawable.spoel_terbakar);

        } else if (!param.isJawaban1() && param.isJawaban2() && !param.isJawaban3()
                && !param.isJawaban4() && !param.isJawaban5() && !param.isJawaban6()
                && !param.isJawaban7() && !param.isJawaban8() && !param.isJawaban9()
                && !param.isJawaban10() && param.isJawaban11()) {
            /** Jawaban nomor P8
             * R8 = IF G2 AND G11 THEN P8 */
            textViewResult.setText("Laker motor rusak / sudah longgar");
            textViewSolusion.setText("Lakukan pembokaran pompa dengan menggunakan peralatan yang lengkap ganti  laker yang ada didepan dan belakang rotor hubungi teknisi apa bila kesulitan melakukan pekerjaan ini karena melepas bering membuuthkan keahlian khusus.");

            imageViewResult.setVisibility(View.VISIBLE);
            imageViewResult.setImageResource(R.drawable.laker_motor_rusak);

        } else {
            /** Jawaban tidak sesuai */
            textViewResult.setText("Hasil tidak di temukan");
            textViewSolusion.setText("Kami mohon maaf karna spesifikasi gejala yang anda sebutkan belum terdekesi pada sistem kami ! ");
            imageViewNotFound.setVisibility(View.VISIBLE);
        }
    }
}
