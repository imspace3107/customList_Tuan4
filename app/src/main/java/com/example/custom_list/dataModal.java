package com.example.custom_list;

public class dataModal {
    int img;
    String Name;
    public dataModal(int img,String Name) {
        super();
        this.img = img;
        this.Name=Name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int image) {
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
