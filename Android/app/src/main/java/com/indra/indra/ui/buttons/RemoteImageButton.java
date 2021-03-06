package com.indra.indra.ui.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;

import androidx.appcompat.widget.AppCompatImageButton;

import com.indra.indra.R;


public class RemoteImageButton extends AppCompatImageButton {

    private String lircName;


    public RemoteImageButton(Context context) {
        super(context);
        lircName = "";
    }

    public RemoteImageButton(Context context, String lircName){
        super(context);
        this.lircName = lircName;
    }

    public RemoteImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        getLircNameFromLayout(context, attrs);
    }

    public RemoteImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        getLircNameFromLayout(context, attrs);
    }


    public String getLircName(){ return lircName; }


    private void getLircNameFromLayout(Context context, AttributeSet attrs){
        int[] idArr = new int[] {R.attr.lircName};
        TypedArray array = context.obtainStyledAttributes(attrs, idArr);
        this.lircName = array.getString(0);
        Log.i("LIRC NAME", lircName);
    }
}
