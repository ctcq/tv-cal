package de.apps.ctcq.tvcalendar.api.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import de.apps.ctcq.tvcalendar.R;
import de.apps.ctcq.tvcalendar.model.entity.TvShow;

public class SearchResultAdapter extends BaseAdapter {

    protected List<TvShow> list;
    protected Context context;

    public SearchResultAdapter(List<TvShow> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ((TvShow)this.getItem(i)).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.textView4))
                .setText(((TvShow) getItem(i)).getName());
        return view;
    }
}
