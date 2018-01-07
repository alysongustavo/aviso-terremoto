/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.quakereport.R;
import com.example.android.quakereport.adapter.EarthquakeAdapter;
import com.example.android.quakereport.data.EarthquakeMock;
import com.example.android.quakereport.domain.Earthquake;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();
    private ViewHolder viewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        EarthquakeMock mock = new EarthquakeMock();
        List<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.addAll(mock.getList());

        // Obter a recyclearview
        this.viewHolder.recyclerView = (RecyclerView) this.findViewById(R.id.recyclerview_tremor);

       EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(earthquakes);
       this.viewHolder.recyclerView.setAdapter(earthquakeAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.viewHolder.recyclerView.setLayoutManager(linearLayoutManager);


    }

    private static class ViewHolder{
        RecyclerView recyclerView;
    }
}
