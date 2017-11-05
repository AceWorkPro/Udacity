package com.example.ace.udacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_spotify_streamer = (Button) findViewById(R.id.btn_spotify_streamer);
        Button btn_scores_app = (Button) findViewById(R.id.btn_scores_app);
        Button btn_library_app = (Button) findViewById(R.id.btn_library_app);
        Button btn_build_it_bigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btn_xyz_reader = (Button) findViewById(R.id.btn_xyz_reader);

        btn_spotify_streamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用：热门电影",Toast.LENGTH_LONG).show();
            }
        });

        btn_scores_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用：股票雄鹰",Toast.LENGTH_LONG).show();

            }
        });

        btn_library_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用：XYZ阅读器",Toast.LENGTH_LONG).show();

            }
        });


        btn_build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用：最新闻",Toast.LENGTH_LONG).show();

            }
        });


        btn_xyz_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用：毕业设计",Toast.LENGTH_LONG).show();

            }
        });


    }
}
