package com.example.septisodium;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FlightsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FlightsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager ;
    View v ;
    private List<objectTemoin> objectTemoinList ;
    public FlightsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ExploreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ExploreFragment newInstance(String param1, String param2) {
        ExploreFragment fragment = new ExploreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        objectTemoinList= new ArrayList<>();
        objectTemoinList.add(new objectTemoin("Temple Diana & Napolon","","","",R.drawable.plan_diana_apolon));
        objectTemoinList.add(new objectTemoin("Temple Neptune","","","",R.drawable.plan_neptune));
        objectTemoinList.add(new objectTemoin("Temple 3 Couloirs","","","",R.drawable.plan_3couloirs));
        objectTemoinList.add(new objectTemoin("Bassin","","","",R.drawable.plan_bassin));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_explore, container, false);
        recyclerView= (RecyclerView)  v.findViewById(R.id.recyclerview1);
        RecyclerviewAdapter recyclerviewAdapter = new RecyclerviewAdapter(getContext(),objectTemoinList);
        layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerviewAdapter);
        recyclerviewAdapter.setOnItemClickListener(new RecyclerviewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getContext(), StepbyStepActivity.class);
                intent.putExtra("photo",objectTemoinList.get(position).getDrawble()) ;
                startActivity(intent);

            }
        });
        // Inflate the layout for this fragment
        return v;
    }
}
