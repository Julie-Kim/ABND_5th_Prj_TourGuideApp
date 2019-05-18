package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourInfoAdapter extends ArrayAdapter<TourInfo> {
    private static final String TAG = "TourInfoAdapter";

    TourInfoAdapter(Activity context, ArrayList<TourInfo> tourInfoList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tourInfoList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final TourInfo tourInfo = getItem(position);

        if (tourInfo == null) {
            return listItemView;
        }

        View titleContainer = listItemView.findViewById(R.id.title_container);
        titleContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailLinkPage(tourInfo);
            }
        });

        TextView titleText = listItemView.findViewById(R.id.title);
        titleText.setText(tourInfo.getTitleResId());

        TextView descriptionText = listItemView.findViewById(R.id.description);
        descriptionText.setText(tourInfo.getDescriptionResId());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(tourInfo.getImageResId());

        TextView addressText = listItemView.findViewById(R.id.address);
        String address = getContext().getString(tourInfo.getAddressResId());
        if (TextUtils.isEmpty(address)) {
            addressText.setVisibility(View.GONE);
        } else {
            addressText.setText(address);
            addressText.setVisibility(View.VISIBLE);
        }

        TextView phoneText = listItemView.findViewById(R.id.phone);
        String phone = getContext().getString(tourInfo.getPhoneResId());
        if (TextUtils.isEmpty(phone)) {
            phoneText.setVisibility(View.GONE);
        } else {
            phoneText.setText(phone);
            phoneText.setVisibility(View.VISIBLE);
        }

        TextView hoursText = listItemView.findViewById(R.id.hours);
        String hours = getContext().getString(tourInfo.getOpeningHoursResId());
        if (TextUtils.isEmpty(hours)) {
            hoursText.setVisibility(View.GONE);
        } else {
            hoursText.setText(hours);
            hoursText.setVisibility(View.VISIBLE);
        }

        TextView linkText = listItemView.findViewById(R.id.view_more);
        linkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailLinkPage(tourInfo);
            }
        });

        return listItemView;
    }

    private void openDetailLinkPage(TourInfo tourInfo) {
        Log.i(TAG, "openDetailLinkPage() tourInfo : " + tourInfo.toString(getContext()));

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getContext().getString(tourInfo.getLinkResId())));
        getContext().startActivity(browserIntent);
    }
}