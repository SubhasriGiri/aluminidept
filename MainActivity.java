package com.example.shank.alumini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String letterList[]={"EEE","IT","MECH","ECE"};
    int lettersIcon[]={R.drawable.eee,R.drawable.it,R.drawable.mech,R.drawable.ece};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridView);
        GridAdapter adapter =new GridAdapter(MainActivity.this,lettersIcon,letterList);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(MainActivity.this, "chosen department:" + letterList[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
