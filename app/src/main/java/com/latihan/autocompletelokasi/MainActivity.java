package com.latihan.autocompletelokasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView et_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AutoCompleteTextView CariLokasi = (AutoCompleteTextView) findViewById(R.id.search);
        final AutocompleteAdapter adapterLokasi = new AutocompleteAdapter(this,android.R.layout.simple_dropdown_item_1line);
        CariLokasi.setAdapter(adapterLokasi);

        //when autocomplete is clicked
        CariLokasi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getLokasi = adapterLokasi.getItem(position).getLokasi();
                CariLokasi.setText(getLokasi);
            }
        });
    }
}