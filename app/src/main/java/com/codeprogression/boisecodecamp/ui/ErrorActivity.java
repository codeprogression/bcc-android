package com.codeprogression.boisecodecamp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.codeprogression.boisecodecamp.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ErrorActivity extends Activity {

    @InjectView(R.id.message)
    TextView messageView;
    private Bundle returnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.error_activity);
        ButterKnife.inject(this);
        String message = getIntent().getStringExtra("MESSAGE");
        returnIntent = getIntent().getBundleExtra("RETURN_INTENT");
        messageView.setText(message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.error, menu);
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

    @Override
    protected void onResume() {
        super.onResume();
    }
}
