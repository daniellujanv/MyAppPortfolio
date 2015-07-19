package dlv.nanodegree.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_spotify_streamer).setOnClickListener(showToast);
        findViewById(R.id.btn_super_duo).setOnClickListener(showToast);
        findViewById(R.id.btn_build_bigger).setOnClickListener(showToast);
        findViewById(R.id.btn_xyz_reader).setOnClickListener(showToast);
        findViewById(R.id.btn_capstone).setOnClickListener(showToast);

    }

    View.OnClickListener showToast = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            String text = "This button will launch my "+((Button)v).getText()+" App";
            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
