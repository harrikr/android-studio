package id.sukenda.burisma.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import id.sukenda.burisma.R;
import id.sukenda.burisma.fragment.InfoFragment;

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
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean doubleBackClick = false;
    private ImageView imageViewMenuGejala;
    private ImageView imageViewMenuMulai;
    private ImageView imageViewMenuPenyakit;
    private ImageView imageViewMenuPanduan;
    private ImageView imageViewMenuTentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_power_white_24dp);
        getSupportActionBar().setTitle("");

        imageViewMenuGejala = (ImageView) findViewById(R.id.image_menu_gejala);
        imageViewMenuGejala.setOnClickListener(this);

        imageViewMenuMulai = (ImageView) findViewById(R.id.image_menu_begin_expert);
        imageViewMenuMulai.setOnClickListener(this);

        imageViewMenuPenyakit = (ImageView) findViewById(R.id.image_menu_penyakit);
        imageViewMenuPenyakit.setOnClickListener(this);

        imageViewMenuPanduan = (ImageView) findViewById(R.id.image_menu_panduan);
        imageViewMenuPanduan.setOnClickListener(this);

        imageViewMenuTentang = (ImageView) findViewById(R.id.image_menu_about);
        imageViewMenuTentang.setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null && data.getExtras() != null)
            for (String key : data.getExtras().keySet())
                Toast.makeText(this, key + " : " + data.getExtras().get(key).toString(), Toast.LENGTH_SHORT).show();

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (doubleBackClick) {
            super.onBackPressed();
            return;
        }

        this.doubleBackClick = true;
        Toast.makeText(this, R.string.text_back, Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackClick = false;
            }
        }, 2000);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Warning")
                    .setMessage("Yakin akan keluar aplikasi ini ?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            MainActivity.this.finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    }).show();
        }

        if (id == R.id.action_info) {
            showInfo();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == imageViewMenuMulai.getId()) {
            Intent intent = new Intent(this, BeginStepActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        }

        if (view.getId() == imageViewMenuGejala.getId()) {
            Intent intent = new Intent(this, GejalaActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        }

        if (view.getId() == imageViewMenuPenyakit.getId()) {
            Intent intent = new Intent(this, PenyakitActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        }

        if (view.getId() == imageViewMenuPanduan.getId()) {
            Intent intent = new Intent(this, PanduanActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        }

        if (view.getId() == imageViewMenuTentang.getId()) {
            Intent intent = new Intent(this, TentangActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        }
    }

    private void showInfo() {
        BottomSheetDialogFragment infoFragment = new InfoFragment();
        infoFragment.show(getSupportFragmentManager(), infoFragment.getTag());
    }
}
