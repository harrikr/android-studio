package id.sukenda.burisma.service;

import android.app.Application;
import id.sukenda.burisma.helper.TypefaceUtil;

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

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "Sansation-Light.otf"); // font from assets: "assets/fonts/Sansation-Light.otf
    }
}
