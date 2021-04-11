package com.MyApplication3.Tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycle;
    private ArrayList<SetGet> seriIphone = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_recycle);
        setTitle("Tugas 3");

        recycle = findViewById(R.id.rcIphone);
        recycle.setHasFixedSize(true);
        seriIphone.addAll(Data.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        recycle.setLayoutManager(new LinearLayoutManager(this));
        Controller controller = new Controller(seriIphone,this);
        recycle.setAdapter(controller);

    }
}