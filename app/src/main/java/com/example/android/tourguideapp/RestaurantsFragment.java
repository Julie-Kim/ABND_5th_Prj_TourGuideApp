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

public class RestaurantsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_info_list, container, false);

        /** Restaurants
         * 1. Sinmi Sikdang
         * 2. Oyull
         * 3. Sanha
         * 4. Cacao Green
         * 5. The Green Table
         * 6. Makoto
         * 7. Badalbi
         * 8. Paul & Paulin (Hongdae Branch)
         * 9. Beard Papa's
         * 10. Pierro Gagnaire (Lotte Hotel Seoul Branch)
         */

        ArrayList<TourInfo> tourInfoList = new ArrayList<>();
        tourInfoList.add(new TourInfo(R.string.sinmi_sikdang, R.string.sinmi_sikdang_detail, R.drawable.sinmi_sikdang,
                R.string.sinmi_sikdang_address, R.string.sinmi_sikdang_hours, R.string.sinmi_sikdang_phone, R.string.sinmi_sikdang_link));
        tourInfoList.add(new TourInfo(R.string.oyull, R.string.oyull_detail, R.drawable.oyull,
                R.string.oyull_address, R.string.oyull_hours, R.string.oyull_phone, R.string.oyull_link));
        tourInfoList.add(new TourInfo(R.string.sanha, R.string.sanha_detail, R.drawable.sanha,
                R.string.sanha_address, R.string.sanha_hours, R.string.sanha_phone, R.string.sanha_link));
        tourInfoList.add(new TourInfo(R.string.cacao_green, R.string.cacao_green_detail, R.drawable.cacao_green,
                R.string.cacao_green_address, R.string.cacao_green_hours, R.string.cacao_green_phone, R.string.cacao_green_link));
        tourInfoList.add(new TourInfo(R.string.the_green_table, R.string.the_green_table_detail, R.drawable.the_green_table,
                R.string.the_green_table_address, R.string.the_green_table_hours, R.string.the_green_table_phone, R.string.the_green_table_link));
        tourInfoList.add(new TourInfo(R.string.makoto, R.string.makoto_detail, R.drawable.makoto,
                R.string.makoto_address, R.string.makoto_hours, R.string.makoto_phone, R.string.makoto_link));
        tourInfoList.add(new TourInfo(R.string.badalbi, R.string.badalbi_detail, R.drawable.badalbi,
                R.string.badalbi_address, R.string.badalbi_hours, R.string.badalbi_phone, R.string.badalbi_link));
        tourInfoList.add(new TourInfo(R.string.paul_n_paulin, R.string.paul_n_paulin_detail, R.drawable.paul_n_paulin,
                R.string.paul_n_paulin_address, R.string.paul_n_paulin_hours, R.string.paul_n_paulin_phone, R.string.paul_n_paulin_link));
        tourInfoList.add(new TourInfo(R.string.beard_papas, R.string.beard_papas_detail, R.drawable.beard_papas,
                R.string.beard_papas_address, R.string.beard_papas_hours, R.string.beard_papas_phone, R.string.beard_papas_link));
        tourInfoList.add(new TourInfo(R.string.pierro_gagnaire, R.string.pierro_gagnaire_detail, R.drawable.pierro_gagnaire,
                R.string.pierro_gagnaire_address, R.string.pierro_gagnaire_hours, R.string.pierro_gagnaire_phone, R.string.pierro_gagnaire_link));

        TourInfoAdapter adapter = new TourInfoAdapter(getActivity(), tourInfoList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}