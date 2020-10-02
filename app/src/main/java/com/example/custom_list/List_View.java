package com.example.custom_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class List_View extends BaseAdapter {
    public ArrayList<dataModal> arraylistListener;
    private List<dataModal> mListenerList;
    Context mContext;

    public List_View(List<dataModal> mListenerList, Context context) {
        mContext = context;
        this.mListenerList = mListenerList;
        this.arraylistListener = new ArrayList<dataModal>();
        this.arraylistListener.addAll(mListenerList);

    }

    public class ViewHolder {

        ImageView mItemPic;
        TextView mLangName;

    }

    @Override
    public int getCount() {
        return mListenerList.size();
    }

    @Override
    public Object getItem(int position) {
        return mListenerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.list, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.img);
            holder.mLangName=(TextView)view.findViewById(R.id.Name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        try {
            int image = mListenerList.get(position).getImg();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(mListenerList.get(position).getName());
        }catch (Exception ex){
        }
        return view;
    }
}
