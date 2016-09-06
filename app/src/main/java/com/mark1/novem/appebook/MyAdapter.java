package com.mark1.novem.appebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Novem on 6/9/2559.
 */
public class MyAdapter extends BaseAdapter { //alt+enter ระหว่าง ex - bas
    //การทำ ประกาศตัวแปร
    private Context context; //ตัวเชื่อมไปยัง xml
    private String[] titleStrings,priceStrings, iconStrings;

    public MyAdapter(Context context, String[] titleStrings, String[] priceStrings, String[] iconStrings) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.priceStrings = priceStrings;
        this.iconStrings = iconStrings;

    } //constructor คือจะเรียกใช้ทั้งหมดที่เขียนไว้ในนี้

    @Override
    public int getCount() {
        return titleStrings.length; //การเอาจำนวนตัว array ตามที่มี  หรือจะกำหนดเลยก็ได้ว่าเอาเท่าไหร่เช่น 14
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //การเปลี่ยนชนิดตัวแปร
        View view1 = layoutInflater.inflate(R.layout.cover, viewGroup, false); //เชื่อมต่อไปยัง xml

        //การ bind widget การผึกตัวแปรดัานบน
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView);
        TextView priceTextView = (TextView) view1.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);

        //Show view
        titleTextView.setText(titleStrings[i]);
        priceTextView.setText(titleStrings[i]);
        Picasso.with(context).load(iconStrings[i]).resize(120,150).into(imageView);
        return view1;

    }
} //main class
