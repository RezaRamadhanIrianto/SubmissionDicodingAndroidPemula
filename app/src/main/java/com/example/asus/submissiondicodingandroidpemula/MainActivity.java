package com.example.asus.submissiondicodingandroidpemula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] judul = {"Keyboard", "Mouse", "Camera", "Phone", "Speaker", "Headset", "Mic", "Gamepad", "Computer", "dock"};
    Integer[] gambar = {
        R.drawable.keyboard,
        R.drawable.mouse,
        R.drawable.camera,
        R.drawable.phone,
        R.drawable.speaker,
        R.drawable.headphone,
        R.drawable.mic,
        R.drawable.gamepad,
        R.drawable.computer,
        R.drawable.ic_dock_black_24dp
    };
    String[] subjudul = {
            "Alat untuk mengetik",
            "Alat untuk menggerakan kursor",
            "Alat untuk memfoto",
            "Alat untuk berbagai keperluan portable",
            "Alat untuk mengeluarkan suara",
            "Alat untuk mengeluarkan suara dengan cara ditempel ditelinga",
            "Alat untuk merekam suara",
            "Alat untuk bermain game",
            "Alat untuk berbagai keperluan",
            "Alat untuk menampilkan gambar"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListAdapter adapter  = new ListAdapter(this, judul, subjudul, gambar);
        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ld) {
                 Intent intent = new Intent(MainActivity.this, detail_page.class);
                intent.putExtra("judul", judul[position]);
                intent.putExtra("subjudul", subjudul[position]);
                startActivity(intent);

            }
        });
    }
}
