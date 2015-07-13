package com.pawnua.android.app.licenseplates;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.pawnua.android.app.licenseplates.model.LicensePlate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MiK on 14.06.2015.
 */
public class LicensePlateAdapter extends RecyclerView.Adapter<LicensePlateAdapter.ViewHolder> implements Filterable {

    private List<LicensePlate> licensePlateList;
    private List<LicensePlate> licensePlateList_orig; // Original Values

    private int spinnerPosition = 0;

    public void setSpinnerPosition(int spinnerPosition) {
        this.spinnerPosition = spinnerPosition;
    }

    public LicensePlateAdapter(List<LicensePlate> licensePlateList) {
        this.licensePlateList = licensePlateList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_license_plate, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        LicensePlate licensePlate = licensePlateList.get(position);

        holder.code1995.setText(licensePlate.getcode1995());
        holder.series1995.setText(licensePlate.getSeries1995_short());
//        holder.series1995full.setText(licensePlate.getSeries1995());
        holder.series1995full.setText("");
        holder.region.setText(licensePlate.getRegion());
        holder.series2004.setText(licensePlate.getSeries2004());

//Handle click event on both title and image click
        holder.code1995.setOnClickListener(clickListener);
        holder.region.setOnClickListener(clickListener);

        holder.code1995.setTag(holder);
        holder.region.setTag(holder);

    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ViewHolder holder = (ViewHolder) view.getTag();
            int position = holder.getPosition();

        }
    };

    @Override
    public int getItemCount() {
        return licensePlateList.size();
    }

    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();        // Holds the results of a filtering operation in values

                List<LicensePlate> FilteredArrList = new ArrayList<>();

                if (licensePlateList_orig == null) {
                    licensePlateList_orig = licensePlateList; // saves the original data in licensePlateList_orig
                }

                if (constraint == null || constraint.length() == 0) {

                    // set the Original result to return
                    results.count = licensePlateList_orig.size();
                    results.values = licensePlateList_orig;
                } else {
                    constraint = constraint.toString().toLowerCase();
                    for (int i = 0; i < licensePlateList_orig.size(); i++) {
                        LicensePlate data = licensePlateList_orig.get(i);
//                        if (data.toLowerCase().startsWith(constraint.toString())) {
                        if (isContains(constraint, data)) {
                            FilteredArrList.add(data);
                        }
                    }
                    // set the Filtered result to return
                    results.count = FilteredArrList.size();
                    results.values = FilteredArrList;
                }

                return results;
            }

            private boolean isContains(CharSequence constraint, LicensePlate data) {
                switch (spinnerPosition){
                    case 0: // All
                        return data.getRegion().toLowerCase().contains(constraint.toString()) || data.getSeries2004().toLowerCase().contains(constraint.toString()) || data.getSeries1995_short().toLowerCase().contains(constraint.toString());
                    case 1: // Region
                        return data.getRegion().toLowerCase().contains(constraint.toString());
                    case 2: // 2004
                        return data.getSeries2004().toLowerCase().contains(constraint.toString());
                    case 3: // 1995
                        return data.getSeries1995_short().toLowerCase().contains(constraint.toString());
                    default:
                        return data.getRegion().toLowerCase().contains(constraint.toString());
                }

            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                licensePlateList = (List<LicensePlate>) results.values;
                notifyDataSetChanged();  // notifies the data with new filtered values
            }
        };
        return filter;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView code1995;
        private TextView series1995;
        private TextView series1995full;
        private TextView region;
        private TextView series2004;

        public ViewHolder(View itemView) {
            super(itemView);
            code1995 = (TextView) itemView.findViewById(R.id.code1995);
            series1995 = (TextView) itemView.findViewById(R.id.series1995);
            series1995full = (TextView) itemView.findViewById(R.id.series1995full);
            region = (TextView) itemView.findViewById(R.id.region);
            series2004 = (TextView) itemView.findViewById(R.id.series2004);
        }
    }
}
