package com.example.a2kon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }

        @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.first:
                getSupportFragmentManager().beginTransaction();
                SecondFragment fragment;

                fragment = new SecondFragment();

                Bundle args = new Bundle();
                args.putString("url", "https://stackoverflow.com/");

                fragment.setArguments(args);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.webLayout, fragment)
                        .addToBackStack(null).commit();
                return true;

            case R.id.second:
                getSupportFragmentManager().beginTransaction();
                SecondFragment fragment1;

                fragment1 = new SecondFragment();

                Bundle args1 = new Bundle();
                args1.putString("url", "https://github.com/");

                fragment1.setArguments(args1);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.webLayout, fragment1)
                        .addToBackStack(null).commit();
                return true;
            case R.id.third:
                finishAffinity();
                System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}




