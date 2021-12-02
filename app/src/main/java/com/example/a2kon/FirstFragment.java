package com.example.a2kon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class FirstFragment extends Fragment {
    Button btn,btn2,btn3;

    public FirstFragment() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container,         false);

        btn = (Button) view.findViewById(R.id.btn);
        btn2 = (Button) view.findViewById(R.id.btn2);
        btn3 = (Button) view.findViewById(R.id.btn3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SecondFragment secondFragment;
                secondFragment = new SecondFragment();

                Bundle bundle = new Bundle();
                bundle.putString("url", "https://stackoverflow.com/");

                secondFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.webLayout, secondFragment);
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SecondFragment secondFragment;
                secondFragment = new SecondFragment();

                Bundle bundle = new Bundle();
                bundle.putString("url", "https://github.com/");

                secondFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.webLayout, secondFragment);
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SecondFragment secondFragment;
                secondFragment = new SecondFragment();

                Bundle bundle = new Bundle();
                bundle.putString("url", "https://vilniustech.lt/");

                secondFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.webLayout, secondFragment);
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();

            }
        });
        return view;
    }

}