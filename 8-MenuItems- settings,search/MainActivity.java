import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_file,menu);
    return true;}

    @Override
    public boolean onOptionsItemSelected( final MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.Menu){
            Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.settings) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            //do something
            return true;
        }
        if (id == R.id.search) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
            //do something
            return true;
        }
        if (id == R.id.email) {
            Toast.makeText(this, "Compose Email", Toast.LENGTH_SHORT).show();
            //do something
            return true;
        }
        if (id == R.id.feedback) {
            Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show();
            //do something
            return true;
        }
        return super.onOptionsItemSelected(item);

        }
    }