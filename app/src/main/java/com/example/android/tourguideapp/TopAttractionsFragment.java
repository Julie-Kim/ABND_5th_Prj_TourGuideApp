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

public class TopAttractionsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_info_list, container, false);

        /* Top 10 Attractions
         * 1. Dongdaemun Market
         * 2. Myeong-dong
         * 3. Gyeongbokgung Palace
         * 4. N Seoul Tower
         * 5. Insa-dong
         * 6. Namdaemun Market
         * 7. Seoul City Wall
         * 8. Dongdaemun Design Plaza
         * 9. Hongdae
         * 10. Cheonggyecheon (Stream)
         */

        ArrayList<TourInfo> tourInfoList = new ArrayList<>();
        tourInfoList.add(new TourInfo(R.string.dongdaemun_market, R.string.dongdaemun_market_detail, R.drawable.dongdaemun_market,
                R.string.dongdaemun_market_address, R.string.dongdaemun_market_hours, R.string.dongdaemun_market_phone, R.string.dongdaemun_market_link));
        tourInfoList.add(new TourInfo(R.string.myeong_dong, R.string.myeong_dong_detail, R.drawable.myeong_dong,
                R.string.myeong_dong_address, R.string.myeong_dong_hours, R.string.myeong_dong_phone, R.string.myeong_dong_link));
        tourInfoList.add(new TourInfo(R.string.gyeonbokgung_palace, R.string.gyeonbokgung_palace_detail, R.drawable.gyeonbokgung_palace,
                R.string.gyeonbokgung_palace_address, R.string.gyeonbokgung_palace_hours, R.string.gyeonbokgung_palace_phone, R.string.gyeonbokgung_palace_link));
        tourInfoList.add(new TourInfo(R.string.n_seoul_tower, R.string.n_seoul_tower_detail, R.drawable.n_seoul_tower,
                R.string.n_seoul_tower_address, R.string.n_seoul_tower_hours, R.string.n_seoul_tower_phone, R.string.n_seoul_tower_link));
        tourInfoList.add(new TourInfo(R.string.insa_dong, R.string.insa_dong_detail, R.drawable.insa_dong,
                R.string.insa_dong_address, R.string.insa_dong_hours, R.string.insa_dong_phone, R.string.insa_dong_link));
        tourInfoList.add(new TourInfo(R.string.namdaemun_market, R.string.namdaemun_market_detail, R.drawable.namdaemun_market,
                R.string.namdaemun_market_address, R.string.namdaemun_market_hours, R.string.namdaemun_market_phone, R.string.namdaemun_market_link));
        tourInfoList.add(new TourInfo(R.string.seoul_city_wall, R.string.seoul_city_wall_detail, R.drawable.seoul_city_wall,
                R.string.seoul_city_wall_address, R.string.seoul_city_wall_hours, R.string.seoul_city_wall_phone, R.string.seoul_city_wall_link));
        tourInfoList.add(new TourInfo(R.string.dongdaemun_design_plaza, R.string.dongdaemun_design_plaza_detail, R.drawable.dongdaemun_design_plaza,
                R.string.dongdaemun_design_plaza_address, R.string.dongdaemun_design_plaza_hours, R.string.dongdaemun_design_plaza_phone, R.string.dongdaemun_design_plaza_link));
        tourInfoList.add(new TourInfo(R.string.hongdae, R.string.hongdae_detail, R.drawable.hongdae,
                R.string.hongdae_address, R.string.hongdae_hours, R.string.hongdae_phone, R.string.hongdae_link));
        tourInfoList.add(new TourInfo(R.string.chenggyechon, R.string.chenggyechon_detail, R.drawable.chenggyechon,
                R.string.chenggyechon_address, R.string.chenggyechon_hours, R.string.chenggyechon_phone, R.string.chenggyechon_link));

        TourInfoAdapter adapter = new TourInfoAdapter(getActivity(), tourInfoList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}