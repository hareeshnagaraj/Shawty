package demboyz.shawtyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends Activity {
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        mp = MediaPlayer.create(this, R.raw.shawty1);

    }

    /*
    * Plays the longer shawtayy
    * */

    public void shawtayOne(View v){
        mp = MediaPlayer.create(this, R.raw.shawty2);
//        mp.release();
        mp.start();
//        mp.release();
    }
    public void shawtayTwo(View v){
        mp = MediaPlayer.create(this, R.raw.shawty1);
//        mp.release();
        mp.start();
//        mp.release();
    }
    public void shawtayThree(View v){
        mp = MediaPlayer.create(this, R.raw.shawty3);
//        mp.release();
        mp.start();
//        mp.release();
    }

    public void groceries(View v){
        mp = MediaPlayer.create(this, R.raw.groceries);
        mp.start();
//        mp.release();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
