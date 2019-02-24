package com.michaelbh.noteingest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NotebookAdaptor extends RecyclerView.Adapter<NotebookAdaptor.NotebookViewHolder> {
    private String[] noteSet;
    public static class NotebookViewHolder extends  RecyclerView.ViewHolder {
        public TextView textView;
        public NotebookViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.notebook_name);
        }
    }
    public NotebookAdaptor(){

    }

    @Override
    public NotebookAdaptor.NotebookViewHolder onCreateViewHolder(ViewGroup parent, int type) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.notebook_list_item, parent, false);

        NotebookViewHolder viewHolder = new NotebookViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NotebookViewHolder notebookViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
