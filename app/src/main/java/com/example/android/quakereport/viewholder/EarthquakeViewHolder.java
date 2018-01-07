package com.example.android.quakereport.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.android.quakereport.R;
import com.example.android.quakereport.domain.Earthquake;
import com.example.android.quakereport.listener.OnListClickInteractionListener;

/**
 * Created by Cookiesoft on 07/01/2018.
 */

public class EarthquakeViewHolder extends RecyclerView.ViewHolder {

    private TextView magnitude;
    private TextView place;
    private TextView data;

    public EarthquakeViewHolder(View itemView) {
        super(itemView);

        this.magnitude = (TextView) itemView.findViewById(R.id.magnitude);
        this.place = (TextView) itemView.findViewById(R.id.place);
        this.data = (TextView) itemView.findViewById(R.id.data);

    }

    public void setbindData(Earthquake earthquake) {

        this.magnitude.setText(String.valueOf(earthquake.getMagnitude()));
        this.place.setText(earthquake.getPlace());
        this.data.setText(earthquake.getDate());
    }
}
