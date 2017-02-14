package com.example.nguyenlinh.sqlitedatabasetutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nguyenlinh on 14/02/2017.
 */

public class ListAdapter extends ArrayAdapter<Contact> {

    public ListAdapter(Context context, int resource, List<Contact> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.activity_contact, null);
        }
        Contact p = getItem(position);
        if (p != null) {
            // Anh xa + Gan gia tri
            TextView txtName = (TextView) view.findViewById(R.id.textViewName);
            txtName.setText(p.getName());

            TextView txtPhoneNumber = (TextView) view.findViewById(R.id.textViewPhoneNumber);
            txtPhoneNumber.setText(p.getPhoneNumber());
        }
        return view;
    }

}
