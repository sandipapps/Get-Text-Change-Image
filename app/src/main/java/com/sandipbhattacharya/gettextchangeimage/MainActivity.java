package com.sandipbhattacharya.gettextchangeimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    ImageView ivCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.editText);
        ivCat = findViewById(R.id.imageView);
    }

    public void start(View view) {
        String name = etName.getText().toString().trim();
        Toast.makeText(this, "Welcome, "+name,Toast.LENGTH_SHORT).show();
        ivCat.setImageResource(R.drawable.cat2);
    }
}