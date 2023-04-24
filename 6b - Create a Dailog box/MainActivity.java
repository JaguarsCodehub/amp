package com.example.practical_6b;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CharSequence [] items = {"Android","Security","Cloud"};
    boolean[] itemsChecked = new boolean[items.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDailog(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("This is a dailogue with simple text");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int id) {
                Toast.makeText(getBaseContext(),"OK CLICKED", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(),"CANCEL CLICKED",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setMultiChoiceItems(items, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean isChecked) {
                Toast.makeText(getBaseContext(),items[i] +(isChecked?"Checked":"UnChecked"),Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog dialog = builder.create();
        builder.show();
    }
}