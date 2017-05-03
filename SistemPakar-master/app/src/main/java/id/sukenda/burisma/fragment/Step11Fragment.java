package id.sukenda.burisma.fragment;

import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.fcannizzaro.materialstepper.AbstractStep;

import id.sukenda.burisma.R;
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
public class Step11Fragment extends AbstractStep {

    private TextView textViewDescription;
    private AppCompatRadioButton radioButtonYes;
    private AppCompatRadioButton radioButtonNo;
    private Pertanyaan pertanyaan;
    private boolean selected = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.step11_fragment, container, false);

        textViewDescription = (TextView) view.findViewById(R.id.text_description);
        radioButtonNo = (AppCompatRadioButton) view.findViewById(R.id.radio_no);
        radioButtonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                selected = true;
                pertanyaan.setJawaban11(false);
                mStepper.getExtras().putSerializable("pertanyaan", pertanyaan);
            }
        });

        radioButtonYes = (AppCompatRadioButton) view.findViewById(R.id.radio_yes);
        radioButtonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                selected = true;
                pertanyaan.setJawaban11(true);
                mStepper.getExtras().putSerializable("pertanyaan", pertanyaan);
            }
        });

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle state) {
        super.onSaveInstanceState(state);
        state.putSerializable("pertanyaan", pertanyaan);
    }

    @Override
    public String name() {
        return "Pertanyaan " + getArguments().getInt("position", 0);
    }

    @Override
    public boolean isOptional() {
        if (selected) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void onStepVisible() {
        pertanyaan = (Pertanyaan) mStepper.getExtras().getSerializable("pertanyaan");
    }

    @Override
    public void onNext() {
        System.out.println("onNext");
    }

    @Override
    public void onPrevious() {
        System.out.println("onPrevious");
    }

    @Override
    public String optional() {
        return "Pertanyaan " + getArguments().getInt("position", 0);
    }

    @Override
    public boolean nextIf() {
        if (selected) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String error() {
        return "<b>Silakan pilih salah satu jawaban</b>";
    }
}
