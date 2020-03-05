package com.example.sayali.farmerauction.Model;

public class Products {

    public String bidendtime,bidstarttime,date,image,name,pid,quantity,time,value;

    public Products() {
    }

    public Products(String bidendtime, String bidstarttime, String date, String image, String name, String pid, String quantity, String time, String value) {
        this.bidendtime = bidendtime;
        this.bidstarttime = bidstarttime;
        this.date = date;
        this.image = image;
        this.name = name;
        this.pid = pid;
        this.quantity = quantity;
        this.time = time;
        this.value = value;
    }

    public String getBidendtime() {
        return bidendtime;
    }

    public void setBidendtime(String bidendtime) {
        this.bidendtime = bidendtime;
    }

    public String getBidstarttime() {
        return bidstarttime;
    }

    public void setBidstarttime(String bidstarttime) {
        this.bidstarttime = bidstarttime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
