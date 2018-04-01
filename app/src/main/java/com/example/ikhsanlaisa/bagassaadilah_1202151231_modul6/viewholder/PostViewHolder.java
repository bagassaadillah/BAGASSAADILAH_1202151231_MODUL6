package com.example.ikhsanlaisa.bagassaadilah_1202151231_modul6.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ikhsanlaisa.bagassaadilah_1202151231_modul6.model.Post;
import com.example.ikhsanlaisa.ikhsan_1202150084_modul6.R;


public class PostViewHolder extends RecyclerView.ViewHolder {
    public TextView titleView;

    public TextView authorView;

    public ImageView starView;

    public TextView numStarsView;

    public TextView bodyView;



    public PostViewHolder(View itemView) {

        super(itemView);



        titleView = itemView.findViewById(R.id.post_title);

        authorView = itemView.findViewById(R.id.post_author);

        starView = itemView.findViewById(R.id.star);

        numStarsView = itemView.findViewById(R.id.post_num_stars);

        bodyView = itemView.findViewById(R.id.post_body);

    }



    public void bindToPost(Post post, View.OnClickListener starClickListener) {

        titleView.setText(post.title);

        authorView.setText(post.author);

        numStarsView.setText(String.valueOf(post.starCount));

        bodyView.setText(post.body);



        starView.setOnClickListener(starClickListener);

    }
}
