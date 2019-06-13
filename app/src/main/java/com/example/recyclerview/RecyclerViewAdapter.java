package com.example.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private List<ListData> moviesList;



        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title, detail;
            ImageView im;

            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.title);
                detail = (TextView) view.findViewById(R.id.detail);
                im = (ImageView) view.findViewById(R.id.image);

            }
        }
    public RecyclerViewAdapter(List<ListData> movieList) {
        this.moviesList = movieList;
    }

        @Override
        public MyViewHolder onCreateViewHolder (ViewGroup viewGroup,int i){
            View itemView =(View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row, viewGroup, false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder (MyViewHolder holder,int position){
            ListData movie = moviesList.get(position);
            holder.title.setText(movie.getTitle());
            holder.detail.setText(movie.getDetail());
            holder.im.setImageResource(movie.getIm());


        }

        @Override
        public int getItemCount () {
            return moviesList.size();
        }


    }

