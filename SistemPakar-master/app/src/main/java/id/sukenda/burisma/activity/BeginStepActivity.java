package id.sukenda.burisma.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.TabStepper;

import id.sukenda.burisma.fragment.Step10Fragment;
import id.sukenda.burisma.fragment.Step11Fragment;
import id.sukenda.burisma.fragment.Step1Fragment;
import id.sukenda.burisma.fragment.Step2Fragment;
import id.sukenda.burisma.fragment.Step3Fragment;
import id.sukenda.burisma.fragment.Step4Fragment;
import id.sukenda.burisma.fragment.Step5Fragment;
import id.sukenda.burisma.fragment.Step6Fragment;
import id.sukenda.burisma.fragment.Step7Fragment;
import id.sukenda.burisma.fragment.Step8Fragment;
import id.sukenda.burisma.fragment.Step9Fragment;
import id.sukenda.burisma.model.Pertanyaan;

/**
 * Created by sukenda on 9/11/16.
 * Project SistemPakar
 *
 * Copyright 2016  sukenda (soekenda09@gmail.com)
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
public class BeginStepActivity extends TabStepper {

    private boolean doubleBackClick = false;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /** TabStepper */
        setLinear(false);
        setErrorTimeout(1500);
        setTitle("Sistem Pakar Kerusakan Pompa Air");
        setAlternativeTab(false);
        setDisabledTouch();
        /*setPreviousVisible();*/

        addStep(createFragment(new Step1Fragment()));
        addStep(createFragment(new Step2Fragment()));
        addStep(createFragment(new Step3Fragment()));
        addStep(createFragment(new Step4Fragment()));
        addStep(createFragment(new Step5Fragment()));
        addStep(createFragment(new Step6Fragment()));
        addStep(createFragment(new Step7Fragment()));
        addStep(createFragment(new Step8Fragment()));
        addStep(createFragment(new Step9Fragment()));
        addStep(createFragment(new Step10Fragment()));
        addStep(createFragment(new Step11Fragment()));

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackClick) {
            super.onBackPressed();
            return;
        }

        this.doubleBackClick = true;
        Toast.makeText(this, "Tekan sekali lagi untuk mebatalkan", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackClick = false;
            }
        }, 2000);
    }

    @Override
    public void onComplete(Bundle data) {
        super.onComplete(data);
        Intent intent = new Intent(this, ResultActivity.class);
        Pertanyaan pertanyaan = (Pertanyaan) data.getSerializable("pertanyaan");
        if (pertanyaan != null){
            intent.putExtra("pertanyaan", pertanyaan);
        }

        startActivity(intent);
    }

    private AbstractStep createFragment(AbstractStep fragment) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", count++);
        fragment.setArguments(bundle);
        return fragment;
    }
}
