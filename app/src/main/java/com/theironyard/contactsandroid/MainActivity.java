package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener{


    ArrayAdapter<Contact> contacts;
    ListView listView;
    EditText contactName;
    EditText contactPhone;
    Button addbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        contactName = (EditText) findViewById(R.id.contactName);
        contactPhone = (EditText) findViewById(R.id.contactPhone);
        addbutton =  (Button) findViewById(R.id.addButton);


        addbutton.setOnClickListener(this);
        listView.setOnItemLongClickListener(this);
        contacts = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(contacts);

    }//End of onCreate Method

    @Override
    public void onClick(View v) {
        String name = contactName.getText().toString();
        String phone = contactPhone.getText().toString();
        Contact newcontact = new Contact(name, phone);
        contacts.add(newcontact);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Contact itemToRemove = contacts.getItem(position);
        contacts.remove(itemToRemove);
        return true;
    }
}//End of MainActivity Class
