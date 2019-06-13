package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ListData> movieList=new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.recycler);

        mAdapter=new RecyclerViewAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManaget=new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mLayoutManaget);

        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }
    private void prepareMovieData(){
        ListData movie=new ListData("Kesari","Action of Sikh", R.drawable.ic_launcher_background);
        movieList.add(movie);

        movie=new ListData("GullyBoy","Drama",R.drawable.ic_launcher_background);
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}
