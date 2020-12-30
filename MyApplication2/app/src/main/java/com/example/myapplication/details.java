package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();
        Books BB = (Books)b.getSerializable("book");

        ImageView img =findViewById(R.id.imageView2);
        TextView name = findViewById(R.id.textView);
        TextView catg = findViewById(R.id.textView2);
        TextView rating = findViewById(R.id.textView3);
        TextView writer = findViewById(R.id.textView4);

        img.setImageResource(BB.getImg());
        name.setText(BB.getName());
        catg.setText(BB.getCatg());
        rating.setText((int) BB.getRating());
        writer.setText(BB.getWriter());





    }
}