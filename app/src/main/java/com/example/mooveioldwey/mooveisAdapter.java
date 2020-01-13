package com.example.mooveioldwey;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class mooveisAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<dataMoovei> data;
    mooveyHendler hodler;

    public mooveisAdapter(Context context, ArrayList<dataMoovei> arreydata) {
        data = arreydata;
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public dataMoovei getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        if (convertView==null) {
            convertView = inflater.inflate(R.layout.item, parent, false);
           onCreat(convertView,parent);

        }else {
            hodler = (mooveyHendler) convertView.getTag();
        }
        dataMoovei moovey = getItem(position);

        bindveiw(moovey);

        return convertView;
    }

    private void bindveiw(dataMoovei moovey ) {

        hodler.imeg.setImageResource(moovey.getImeg());
        hodler.titel.setText(moovey.getTitel());
        hodler.text.setText(moovey.getText());
    }

    private void onCreat(View convertView, ViewGroup parent) {
//        convertView = inflater.inflate(R.layout.item, parent, false);
        hodler = new mooveyHendler();

        hodler.imeg = convertView.findViewById(R.id.immg);
        hodler.titel = convertView.findViewById(R.id.TextViewTitel);
        hodler.text = convertView.findViewById(R.id.TextViewText);
        convertView.setTag(hodler);
    }

    public static class mooveyHendler{
        public TextView titel,text;
        public ImageView imeg;
    }

}
