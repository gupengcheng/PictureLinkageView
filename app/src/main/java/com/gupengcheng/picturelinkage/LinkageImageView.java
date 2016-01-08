package com.gupengcheng.picturelinkage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by pcgu on 16-1-8.
 */
public class LinkageImageView extends ImageView {
    public LinkageImageView(Context context) {
        super(context);
    }

    public LinkageImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinkageImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public LinkageImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
