package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Dialog_box.DialogListener {

    private Button add;
    ArrayList<Data> DataList = new ArrayList<Data>();
    @Override
    public void applyTexts(String Name, String Age, String RollNo) {

        DataList.add(new Data(Name, Age, RollNo));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(DataList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        add = (Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();

            }
        });

    }
    public void openDialog(){

        Dialog_box dialog = new Dialog_box();
        dialog.show(getSupportFragmentManager(),"Dialog");

    }
}
