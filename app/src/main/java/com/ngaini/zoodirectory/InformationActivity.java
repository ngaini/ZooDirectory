package com.ngaini.zoodirectory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class InformationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    public void makeCall(View view)
    {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        TextView zoo_phone_id = (TextView )findViewById(R.id.zoo_phone_text);
//        Log.v("NATHAN", zoo_phone_id.getText().toString().trim()+" !!!");
//        Toast.makeText(InformationActivity.this ,zoo_phone_id.getText().toString().trim()+" !!!",Toast.LENGTH_SHORT  ).show();
        callIntent.setData(Uri.parse("tel:"+zoo_phone_id.getText().toString().trim()));

        startActivity(callIntent );
    }


}
