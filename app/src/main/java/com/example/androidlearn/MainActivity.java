package com.example.androidlearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Menu_Add:
                Toast.makeText(this, "You clicked Add!", Toast.LENGTH_SHORT).show();
            case R.id.Menu_Remove:
                Toast.makeText(this, "You clicked Remove!", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        Button toastBtn = (Button) findViewById(R.id.clickBtn);
        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked me!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}