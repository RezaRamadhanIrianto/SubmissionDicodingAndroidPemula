package com.example.asus.submissiondicodingandroidpemula;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {
    private final Activity ctx;
    private final String[] judul;
    private final String[] subjudul;
    private final Integer[] gambar;

    public ListAdapter(Activity ctx, String[] judul, String[] subjudul, Integer[] gambar ){
        super(ctx, R.layout.layout_list, judul);
        this.ctx = ctx;
        this.judul = judul;
        this.subjudul = subjudul;
        this.gambar = gambar;
    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = ctx.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.layout_list, null, true);

        TextView textjudul = rowView.findViewById(R.id.judul);
        TextView textsubjudul = rowView.findViewById(R.id.subjudul);
        ImageView textgambar = rowView.findViewById(R.id.gambar);

        textjudul.setText(judul[position]);
        textsubjudul.setText(subjudul[position]);
        textgambar.setImageResource(gambar[position]);

        return rowView;

    }
}
