package com.gupengcheng.picturelinkage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by pcgu on 16-1-8.
 */
public class PicturePreviewImageView extends ImageView {
    public PicturePreviewImageView(Context context) {
        super(context);
    }

    public PicturePreviewImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PicturePreviewImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public PicturePreviewImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
