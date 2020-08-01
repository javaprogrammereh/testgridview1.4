package com.example.test;

public class item_model_menu_general {
    /*1.model fields*/
    private int uAvatar;
    private String uName;
    private String uReshte;
    private String uPrice;
    /* 2.constructors */
    public item_model_menu_general() {
    }

    public item_model_menu_general(int uAvatar) {
        this.uAvatar = uAvatar;
    }


    public item_model_menu_general(int uAvatar, String uName, String uReshte, String uPrice) {
        this.uAvatar = uAvatar;
        this.uName = uName;
        this. uReshte= uReshte;
        this.uPrice = uPrice;
    }
    public int getuAvatar() {
        return uAvatar;
    }

    public void setuAvatar(int uAvatar) {
        this.uAvatar = uAvatar;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuReshte() {
        return uReshte;
    }

    public void setuReshte(String uReshte) {
        this.uReshte = uReshte;
    }

    public String getuPrice() {
        return uPrice;
    }

    public void setuPrice(String uPrice) {
        this.uPrice = uPrice;
    }

}

