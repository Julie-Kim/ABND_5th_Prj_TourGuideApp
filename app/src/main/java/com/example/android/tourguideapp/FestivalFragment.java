package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FestivalFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_info_list, container, false);

        /** Festival
         * 1. Yeon Deung Hoe (Lotus Lantern Festival) (5/3 - 5/5)
         * 2. Seoul Drum Festival 2019 (5/25 - 5/26)
         * 3. Seoul Rose Festival (5/24~26)
         * 4. Seoul Bamdokkaebi Night Market (4/5 - 10/27)
         */

        ArrayList<TourInfo> tourInfoList = new ArrayList<>();
        tourInfoList.add(new TourInfo(R.string.yeon_deung_hoe, R.string.yeon_deung_hoe_detail, R.drawable.yeon_deung_hoe,
                R.string.yeon_deung_hoe_address, R.string.yeon_deung_hoe_hours, R.string.yeon_deung_hoe_phone, R.string.yeon_deung_hoe_link));
        tourInfoList.add(new TourInfo(R.string.seoul_drum_festival, R.string.seoul_drum_festival_detail, R.drawable.seoul_drum_festival,
                R.string.seoul_drum_festival_address, R.string.seoul_drum_festival_hours, R.string.seoul_drum_festival_phone, R.string.seoul_drum_festival_link));
        tourInfoList.add(new TourInfo(R.string.seoul_rose_festival, R.string.seoul_rose_festival_detail, R.drawable.seoul_rose_festival,
                R.string.seoul_rose_festival_address, R.string.seoul_rose_festival_hours, R.string.seoul_rose_festival_phone, R.string.seoul_rose_festival_link));
        tourInfoList.add(new TourInfo(R.string.seoul_bamdokkaebi_night_market, R.string.seoul_bamdokkaebi_night_market_detail, R.drawable.seoul_bamdokkaebi_night_market,
                R.string.seoul_bamdokkaebi_night_market_address, R.string.seoul_bamdokkaebi_night_market_hours, R.string.seoul_bamdokkaebi_night_market_phone, R.string.seoul_bamdokkaebi_night_market_link));

        TourInfoAdapter adapter = new TourInfoAdapter(getActivity(), tourInfoList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}