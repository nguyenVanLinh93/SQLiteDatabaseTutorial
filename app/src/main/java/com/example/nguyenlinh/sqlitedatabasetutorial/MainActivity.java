package com.example.nguyenlinh.sqlitedatabasetutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.lisViewContact);

        //create database
        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        /*
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Ravi", "9100000000"));
        db.addContact(new Contact("Srinivas", "9199999999"));
        db.addContact(new Contact("Tommy", "9522222222"));
        db.addContact(new Contact("Karthik", "9533333333"));*/

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        final List<Contact> contacts = db.getAllContacts();

        /*for (Contact cn : contacts) {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }*/

        // create adapter contact
        ListAdapter adapter = new ListAdapter(MainActivity.this, R.layout.activity_contact, contacts);

        // set adapter
        mListView.setAdapter(adapter);

        // set onitemclick bat su kien khi click vao 1 item nao do
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), contacts.get(position).getID()+"vi tri"+position, Toast.LENGTH_LONG).show();
            }
        });
    }
}
