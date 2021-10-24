package com.example.xyzreader.data;

import android.app.Activity;
import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

import java.util.List;

import static android.content.ContentValues.TAG;

public class ArticleBodyAdapter extends RecyclerView.Adapter<ArticleBodyAdapter.ViewHolder> {


    private Context context;
    private List<String> articleChunks;

    public ArticleBodyAdapter(Context context, List<String> articleChunks) {
        this.context = context;
        this.articleChunks = articleChunks;
        Log.d(TAG, "ArticleBodyAdapter: ");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View articleChunkView = inflater.inflate(R.layout.recyclerview_article_chunk, parent, false);
        ViewHolder viewHolder = new ViewHolder(articleChunkView);

        Log.d(TAG, "onCreateViewHolder: ");
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (articleChunks != null) {
            final String articleChunk = articleChunks.get(position);
            holder.mArticleChunk.setText(articleChunk);

        }
    }

    @Override
    public int getItemCount() {
        return articleChunks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mArticleChunk;

        public ViewHolder(View itemView) {
            super(itemView);
            this.mArticleChunk = (TextView) itemView.findViewById(R.id.article_chunk);

        }
    }


}
