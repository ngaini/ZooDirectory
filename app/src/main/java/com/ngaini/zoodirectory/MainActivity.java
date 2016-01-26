package com.ngaini.zoodirectory;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    String[] animals = {"Lion","Orangutan","Panda","Polar Bear","Squirrel" };
    Integer[] image_source = {R.drawable.majestic_lion,R.drawable.orangutan, R.drawable.panda, R.drawable.polar_bear, R.drawable.squirrel};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createListView();

    }


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

    //Method for creating the list view
    public void createListView()
    {
        ListView list_view_id =(ListView)findViewById(R.id.listView);
        ListAdapter adapter = new custom_zoo_adapter(this, image_source, animals);

        list_view_id.setAdapter(adapter);
        list_view_id.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected_animal = String.valueOf(parent.getItemAtPosition(position));
                Integer image_value = image_source[position];
                Toast.makeText(MainActivity.this, selected_animal+"::"+position, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailActivity.class );
                intent.putExtra("animal_name",selected_animal);
                intent.putExtra("animal_image_value", image_value);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
}
