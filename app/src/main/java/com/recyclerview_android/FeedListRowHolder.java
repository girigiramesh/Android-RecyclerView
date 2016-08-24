package com.recyclerview_android;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ramesh on 8/24/16.
 */
public class FeedListRowHolder extends RecyclerView.ViewHolder {
    protected ImageView thumbnail;
    protected TextView title;

    public FeedListRowHolder(View view) {
        super(view);
        this.thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        this.title = (TextView) view.findViewById(R.id.title);
    }

}
