package com.websarva.wings.android.gridview1203;

/*
Copyright 2013 Square, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
//AndroidX
import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity{

    private static final String[] photos = {
            "default", "default2",
            "default3","default4",
            "default5","default6",
            "default7", "default8",
            "default9", "default10",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // GridViewのインスタンスを生成
        GridView gridview = findViewById(R.id.gridview);

        // BaseAdapter を継承したGridAdapterのインスタンスを生成
        GridAdapter adapter = new GridAdapter(
                this.getApplicationContext(),
                R.layout.grid_items,
                photos);

        // gridViewにadapterをセット
        gridview.setAdapter(adapter);

    }
}
