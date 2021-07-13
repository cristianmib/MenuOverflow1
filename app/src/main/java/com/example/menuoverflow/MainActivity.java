package com.example.menuoverflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuoverflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.op1) {
            Toast.makeText(this, "Seleccionaste la opción 1", Toast.LENGTH_LONG).show();
        } else if (id == R.id.op2) {
            Toast.makeText(this, "Seleccionaste la opción 2", Toast.LENGTH_LONG).show();
        } else if (id == R.id.op3) {
            Toast.makeText(this, "Seleccionaste la opción 3", Toast.LENGTH_LONG).show();
        } else if (id == R.id.op4) {
            Toast.makeText(this, "Seleccionaste la opción 4", Toast.LENGTH_LONG).show();

        }
        return super.onOptionsItemSelected(item);
    }



}
