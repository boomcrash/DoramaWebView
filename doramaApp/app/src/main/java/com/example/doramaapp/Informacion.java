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
 * Use the {@link Informacion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Informacion extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Informacion() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Informacion.
     */
    // TODO: Rename and change types and number of parameters
    public static Informacion newInstance(String param1, String param2) {
        Informacion fragment = new Informacion();
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


    LinearLayout pandrama,estrenosdoramas,doramasmp4,asiaculture;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_informacion, container, false);


        pandrama=view.findViewById(R.id.PANDRAMA);
        estrenosdoramas=view.findViewById(R.id.ESTRENOSDORAMAS);
        doramasmp4=view.findViewById(R.id.DORAMASMP4);
        asiaculture=view.findViewById(R.id.ASIACULTURE);




        pandrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), com.example.doramaapp.DoramasPages.ConAddBlock.class);
                i.putExtra("url","https://pandrama.com/");
                startActivity(i);
            }
        });

        estrenosdoramas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), com.example.doramaapp.DoramasPages.ConAddBlock.class);
                i.putExtra("url","https://www23.estrenosdoramas.net/");
                startActivity(i);
            }
        });

        asiaculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), com.example.doramaapp.DoramasPages.ConAddBlock.class);
                i.putExtra("url","https://www.asiaculturee.com");
                startActivity(i);
            }
        });

        doramasmp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), com.example.doramaapp.DoramasPages.ConAddBlock.class);
                i.putExtra("url","https://doramasmp4.io/");
                startActivity(i);
            }
        });


        return view;
    }
}