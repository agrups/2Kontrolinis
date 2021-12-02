package com.example.a2kon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}








/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }*/




/*    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.first:
                return true;
            case R.id.second:
                return true;
            case R.id.third:
                finishAffinity();
                System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }*/



/*                getSupportFragmentManager().beginTransaction();
                SecondFragment fragment;

                fragment = new SecondFragment();

                Bundle args = new Bundle();
                args.putString("url", "https://stackoverflow.com/");

                fragment.setArguments(args);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.graphPlaceHolder, fragment)
                        .addToBackStack(null).commit();*/