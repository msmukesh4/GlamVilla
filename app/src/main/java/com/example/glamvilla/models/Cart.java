package com.example.glamvilla.models;

/**
 * Created by mukesh on 6/7/16.
 */
public class Cart {

    String shop_name;
    String service_name;
    String service_uuid;
    String time_slots;
    int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getTime_slots() {
        return time_slots;
    }

    public void setTime_slots(String time_slots) {
        this.time_slots = time_slots;
    }

    public String getService_uuid() {
        return service_uuid;
    }

    public void setService_uuid(String service_uuid) {
        this.service_uuid = service_uuid;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

}
