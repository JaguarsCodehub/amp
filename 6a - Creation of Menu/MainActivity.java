package com.example.practical_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.menus,menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.newb:
                Toast.makeText(this, "File Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Share:
                Toast.makeText(this, "Open Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(this, "Save Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this, "Save As Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Exit:
                Toast.makeText(this, "Exit Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
    /* public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.newb) {
            Toast.makeText(this, "File Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.Share) {
            Toast.makeText(this, "Open Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.delete) {
            Toast.makeText(this, "Save Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.save) {
            Toast.makeText(this, "Save As Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.search) {
            Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.Exit) {
            Toast.makeText(this, "Exit Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
    } */
    
}
