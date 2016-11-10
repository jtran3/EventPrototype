package edu.ggc.john.eventprototype;

/**
 * Created by jtran_000 on 11/9/2016.
 */

import android.graphics.Bitmap;

public class PhoneBook
{
    private Bitmap mAvatar;
    private String mName;
    private String mPhone;

    public PhoneBook() {
    }

    public PhoneBook(Bitmap mAvatar, String mName, String mPhone)
    {
        this.mAvatar = mAvatar;
        this.mName = mName;
        this.mPhone = mPhone;
    }

    public Bitmap getmAvatar() {
        return mAvatar;
    }

    public void setmAvatar(Bitmap mAvatar) {
        this.mAvatar = mAvatar;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
