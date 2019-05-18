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

public class EventFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_info_list, container, false);

        /** Event
         * 1. Namsangol Hanok Village : All About Korean Traditional Experience 2019
         * 2. Foreigner Taekwondo Experience Program
         * 3. Hallyu K-food Cooking Class
         * 4. Workshop for my DEAR
         */

        ArrayList<TourInfo> tourInfoList = new ArrayList<>();
        tourInfoList.add(new TourInfo(R.string.namsangol_hanok_village, R.string.namsangol_hanok_village_detail, R.drawable.namsangol_hanok_village,
                R.string.namsangol_hanok_village_address, R.string.namsangol_hanok_village_hours, R.string.namsangol_hanok_village_phone, R.string.namsangol_hanok_village_link));
        tourInfoList.add(new TourInfo(R.string.foreigner_taekwondo_experience_program, R.string.foreigner_taekwondo_experience_program_detail, R.drawable.foreigner_taekwondo_experience_program,
                R.string.foreigner_taekwondo_experience_program_address, R.string.foreigner_taekwondo_experience_program_hours, R.string.foreigner_taekwondo_experience_program_phone, R.string.foreigner_taekwondo_experience_program_link));
        tourInfoList.add(new TourInfo(R.string.hallyu_k_food_cooking_class, R.string.hallyu_k_food_cooking_class_detail, R.drawable.hallyu_k_food_cooking_class,
                R.string.hallyu_k_food_cooking_class_address, R.string.hallyu_k_food_cooking_class_hours, R.string.hallyu_k_food_cooking_class_phone, R.string.hallyu_k_food_cooking_class_link));
        tourInfoList.add(new TourInfo(R.string.workshop_for_my_dear, R.string.workshop_for_my_dear_detail, R.drawable.workshop_for_my_dear,
                R.string.workshop_for_my_dear_address, R.string.workshop_for_my_dear_hours, R.string.workshop_for_my_dear_phone, R.string.workshop_for_my_dear_link));

        TourInfoAdapter adapter = new TourInfoAdapter(getActivity(), tourInfoList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}