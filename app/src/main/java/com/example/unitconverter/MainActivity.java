package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements ItemAdapter.ItemClicked{
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this,1, GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        itemAdapter = new ItemAdapter(ApplicationClass.listItems,this);
        recyclerView.setAdapter(itemAdapter);
    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this, ApplicationClass.listItems.get(index).getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("index",index);
        intent.putExtra("itemName",ApplicationClass.listItems.get(index).getName());
        startActivity(intent);
        overridePendingTransition(R.anim.right_to_left,R.anim.right_to_left);
    }
}