package com.ruvik1001.arm_seller;

import android.media.Image;
import android.widget.Adapter;

public class Atom  {

    public Image img;
    public String text;

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Atom(Image img, String text) {
        this.img = img;
        this.text = text;
    }

    public Atom() {
    }
}
