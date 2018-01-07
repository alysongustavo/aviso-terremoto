package com.example.android.quakereport.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.quakereport.R;
import com.example.android.quakereport.domain.Earthquake;
import com.example.android.quakereport.listener.OnListClickInteractionListener;
import com.example.android.quakereport.viewholder.EarthquakeViewHolder;

import java.util.List;

public class EarthquakeAdapter extends RecyclerView.Adapter<EarthquakeViewHolder> {

    private List<Earthquake> earthquakeList;

    //private OnListClickInteractionListener mOnListClickInteractionListener;

    public EarthquakeAdapter(List<Earthquake> earthquakes){
        this.earthquakeList = earthquakes;
        // this.mOnListClickInteractionListener = listener;
    }

    @Override
    public EarthquakeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.row_earthquake_list,parent,false);

        return new EarthquakeViewHolder(view);

    }

    @Override
    public void onBindViewHolder(EarthquakeViewHolder holder, int position) {
        Earthquake earthquake = this.earthquakeList.get(position);

        holder.setbindData(earthquake);
    }

    @Override
    public int getItemCount() {
        return earthquakeList.size();
    }
}
