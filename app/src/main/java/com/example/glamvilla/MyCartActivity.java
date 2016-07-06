package com.example.glamvilla;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.glamvilla.models.Cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mukesh on 6/7/16.
 */
public class MyCartActivity extends AppCompatActivity {
    ListView cart_list;
    public static List<Cart> cartArrayList = new ArrayList<Cart>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        cart_list = (ListView) findViewById(R.id.cart_item_list);

        Cart tempCartObj = new Cart();
        tempCartObj.setShop_name("Raju spa");
        tempCartObj.setService_name("full body spa");
        tempCartObj.setService_uuid("123123123123123123123");
        tempCartObj.setTime_slots("[12]");
        cartArrayList.add(tempCartObj);

        tempCartObj = new Cart();
        tempCartObj.setShop_name("Shyamu Sports");
        tempCartObj.setService_name("Cricket");
        tempCartObj.setService_uuid("1231231sdcmm23123123123");
        tempCartObj.setTime_slots("[15,16]");
        cartArrayList.add(tempCartObj);

        cart_list.setAdapter(new CartAdapter(getApplicationContext(),cartArrayList));


    }
}
