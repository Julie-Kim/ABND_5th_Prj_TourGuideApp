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

public class UniqueStaysFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_info_list, container, false);

        /* Unique Stays
         * 1. Doo Guesthouse
         * 2. Woori-jip Guesthouse
         * 3. Templestay (Bongeunsa Temple)
         * 4. Seoul Grand Park Campground
         * 5. Doo Guesthouse (Bukchon)
         * 6. WWOOF Korea Guesthouse
         * 7. Namhyundang Hanok Guesthouse
         */

        ArrayList<TourInfo> tourInfoList = new ArrayList<>();
        tourInfoList.add(new TourInfo(R.string.doo_guesthouse, R.string.doo_guesthouse_detail, R.drawable.doo_guesthouse,
                R.string.doo_guesthouse_address, R.string.doo_guesthouse_hours, R.string.doo_guesthouse_phone, R.string.doo_guesthouse_link));
        tourInfoList.add(new TourInfo(R.string.woorijip_guesthouse, R.string.woorijip_guesthouse_detail, R.drawable.woorijip_guesthouse,
                R.string.woorijip_guesthouse_address, R.string.woorijip_guesthouse_hours, R.string.woorijip_guesthouse_phone, R.string.woorijip_guesthouse_link));
        tourInfoList.add(new TourInfo(R.string.templestay, R.string.templestay_detail, R.drawable.templestay,
                R.string.templestay_address, R.string.templestay_hours, R.string.templestay_phone, R.string.templestay_link));
        tourInfoList.add(new TourInfo(R.string.seoul_grand_park_campground, R.string.seoul_grand_park_campground_detail, R.drawable.seoul_grand_park_campground,
                R.string.seoul_grand_park_campground_address, R.string.seoul_grand_park_campground_hours, R.string.seoul_grand_park_campground_phone, R.string.seoul_grand_park_campground_link));
        tourInfoList.add(new TourInfo(R.string.doo_guesthouse_bukchon, R.string.doo_guesthouse_bukchon_detail, R.drawable.doo_guesthouse_bukchon,
                R.string.doo_guesthouse_bukchon_address, R.string.doo_guesthouse_bukchon_hours, R.string.doo_guesthouse_bukchon_phone, R.string.doo_guesthouse_bukchon_link));
        tourInfoList.add(new TourInfo(R.string.wwoof_korea_guesthouse, R.string.wwoof_korea_guesthouse_detail, R.drawable.wwoof_korea_guesthouse,
                R.string.wwoof_korea_guesthouse_address, R.string.wwoof_korea_guesthouse_hours, R.string.wwoof_korea_guesthouse_phone, R.string.wwoof_korea_guesthouse_link));
        tourInfoList.add(new TourInfo(R.string.namhyundang_hanok_guesthouse, R.string.namhyundang_hanok_guesthouse_detail, R.drawable.namhyundang_hanok_guesthouse,
                R.string.namhyundang_hanok_guesthouse_address, R.string.namhyundang_hanok_guesthouse_hours, R.string.namhyundang_hanok_guesthouse_phone, R.string.namhyundang_hanok_guesthouse_link));

        TourInfoAdapter adapter = new TourInfoAdapter(getActivity(), tourInfoList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}