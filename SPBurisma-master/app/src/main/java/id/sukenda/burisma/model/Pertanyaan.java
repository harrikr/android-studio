package id.sukenda.burisma.model;

import java.io.Serializable;

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

public class Pertanyaan implements Serializable {

    private int id;
    private boolean jawaban1;
    private boolean jawaban2;
    private boolean jawaban3;
    private boolean jawaban4;
    private boolean jawaban5;
    private boolean jawaban6;
    private boolean jawaban7;
    private boolean jawaban8;
    private boolean jawaban9;
    private boolean jawaban10;
    private boolean jawaban11;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isJawaban1() {
        return jawaban1;
    }

    public void setJawaban1(boolean jawaban1) {
        this.jawaban1 = jawaban1;
    }

    public boolean isJawaban2() {
        return jawaban2;
    }

    public void setJawaban2(boolean jawaban2) {
        this.jawaban2 = jawaban2;
    }

    public boolean isJawaban3() {
        return jawaban3;
    }

    public void setJawaban3(boolean jawaban3) {
        this.jawaban3 = jawaban3;
    }

    public boolean isJawaban4() {
        return jawaban4;
    }

    public void setJawaban4(boolean jawaban4) {
        this.jawaban4 = jawaban4;
    }

    public boolean isJawaban5() {
        return jawaban5;
    }

    public void setJawaban5(boolean jawaban5) {
        this.jawaban5 = jawaban5;
    }

    public boolean isJawaban6() {
        return jawaban6;
    }

    public void setJawaban6(boolean jawaban6) {
        this.jawaban6 = jawaban6;
    }

    public boolean isJawaban7() {
        return jawaban7;
    }

    public void setJawaban7(boolean jawaban7) {
        this.jawaban7 = jawaban7;
    }

    public boolean isJawaban8() {
        return jawaban8;
    }

    public void setJawaban8(boolean jawaban8) {
        this.jawaban8 = jawaban8;
    }

    public boolean isJawaban9() {
        return jawaban9;
    }

    public void setJawaban9(boolean jawaban9) {
        this.jawaban9 = jawaban9;
    }

    public boolean isJawaban10() {
        return jawaban10;
    }

    public void setJawaban10(boolean jawaban10) {
        this.jawaban10 = jawaban10;
    }

    public boolean isJawaban11() {
        return jawaban11;
    }

    public void setJawaban11(boolean jawaban11) {
        this.jawaban11 = jawaban11;
    }

    @Override
    public String toString() {
        return "Pertanyaan{" +
                "id=" + id +
                ", jawaban1=" + jawaban1 +
                ", jawaban2=" + jawaban2 +
                ", jawaban3=" + jawaban3 +
                ", jawaban4=" + jawaban4 +
                ", jawaban5=" + jawaban5 +
                ", jawaban6=" + jawaban6 +
                ", jawaban7=" + jawaban7 +
                ", jawaban8=" + jawaban8 +
                ", jawaban9=" + jawaban9 +
                ", jawaban10=" + jawaban10 +
                ", jawaban11=" + jawaban11 +
                '}';
    }
}
