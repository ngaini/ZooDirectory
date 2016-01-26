package com.ngaini.zoodirectory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nathan on 1/25/2016.
 */
public class custom_zoo_adapter extends ArrayAdapter<String> {


    private Integer[] animal_images;
    public custom_zoo_adapter(Context context,Integer[] animal_images, String[] animals ) {

        //specify the layout that the information needs to set into
        super(context, R.layout.list_view_layout, animals);

        this.animal_images=animal_images;
    }

    /**
     * Inform the application that for the animal string that we passed in, this is where and how i want to lay it out
      */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //means get ready for rendering . Context means background information
        LayoutInflater zoo_inflater = LayoutInflater.from(getContext());
        //custom view is going to be equal to one custom row, that is the image with the text
        View customView = zoo_inflater.inflate(R.layout.list_view_layout,parent,false);

        //get selected value
        String animal_name_value = getItem(position);
//        Integer animal_image_value= Integer.parseInt(getItem(position));
        //get the textview id
        TextView text_view_id = (TextView) customView.findViewById(R.id.animal_name_textView);

        //get imageView id
        ImageView image_view_id= (ImageView) customView.findViewById(R.id.animal_image_imageView);

        text_view_id.setText(animal_name_value);
        image_view_id.setImageResource(animal_images[position]);

        return customView;

    }
}
