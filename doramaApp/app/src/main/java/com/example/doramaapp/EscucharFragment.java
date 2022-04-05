package com.example.doramaapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EscucharFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EscucharFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EscucharFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EscucharFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EscucharFragment newInstance(String param1, String param2) {
        EscucharFragment fragment = new EscucharFragment();
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
    }

    LinearLayout animeflv,crunchyroll,kanime,fenix;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_escuchar, container, false);

        animeflv =view.findViewById(R.id.ANIMEFLV);
        crunchyroll=view.findViewById(R.id.CRUNCHYROLL);
        kanime=view.findViewById(R.id.KANIME);
        fenix=view.findViewById(R.id.ANIMEFENIX);
        animeflv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), com.example.doramaapp.DoramasPages.ConAddBlock.class);
                i.putExtra("url","https://www3.animeflv.net/");
                startActivity(i);
            }
        });

        crunchyroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), com.example.doramaapp.DoramasPages.ConAddBlock.class);
                i.putExtra("url","https://www.crunchyroll.com/es/attack-on-titan?utm_source=paid_cr&utm_medium=google-search&utm_campaign=conversion&utm_term=crunchyroll&referrer=paid_cr_google-search_conversion\n");
                startActivity(i);
            }
        });

        kanime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), com.example.doramaapp.DoramasPages.ConAddBlock.class);
                i.putExtra("url","https://jkanime.net/");
                startActivity(i);
            }
        });

        fenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), com.example.doramaapp.DoramasPages.ConAddBlock.class);
                i.putExtra("url","https://www.animefenix.com/");
                startActivity(i);
            }
        });
        return view;
    }
}