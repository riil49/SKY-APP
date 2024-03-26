package com.example.myapplication;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class items2 implements Parcelable {
    int Image ;
    String items ;

    String subItems ;

    public items2(int image, String items, String subItems) {
        this.Image = image;
        this.items = items;
        this.subItems = subItems;
    }

    protected items2(Parcel in) {
        Image = in.readInt();
        items = in.readString();
        subItems = in.readString();
    }

    public static final Creator<items2> CREATOR = new Creator<items2>() {
        @Override
        public items2 createFromParcel(Parcel in) {
            return new items2(in);
        }

        @Override
        public items2[] newArray(int size) {
            return new items2[size];
        }
    };

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getSubItems() {
        return subItems;
    }

    public void setSubItems(String subItems) {
        this.subItems = subItems;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(Image);
        parcel.writeString(items);
        parcel.writeString(subItems);
    }
}


