package com.example.glamvilla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.glamvilla.models.Cart;

import java.util.List;

/**
 * Created by mukesh on 6/7/16.
 */
public class CartAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    List<Cart> cart_list;

    public CartAdapter(Context context, List<Cart> cart_list) {
        this.context = context;
        this.cart_list = cart_list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return cart_list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        myCartHolder holder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.cart_item,null,false);
            holder = new myCartHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (myCartHolder) convertView.getTag();
        }

        return null;
    }
}
class myCartHolder {
    TextView tv_service_name,tv_service_cost, tv_service_time,shop_name,tv_time_slot;
    myCartHolder(View view){

    }
}
