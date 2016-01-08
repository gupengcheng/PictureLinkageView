package com.gupengcheng.picturelinkage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by pcgu on 16-1-8.
 */
public class PicturePreviewImageView extends RelativeLayout {
    private LayoutInflater mLayoutInflater;
    private View mPreviewLayout;
    private ImageView mPreviewImg;
    private View mSwitcherLayout;
    private ImageView mSwitcherImg;

    public PicturePreviewImageView(Context context) {
        super(context);
        init(context);
    }

    public PicturePreviewImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PicturePreviewImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public PicturePreviewImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
        mPreviewLayout = mLayoutInflater.inflate(R.layout.preview_item, null);
        addView(mPreviewLayout);
        mSwitcherLayout = mLayoutInflater.inflate(R.layout.switcher_item, null);
        mPreviewImg = (ImageView) mPreviewLayout.findViewById(R.id.preview_img);
        mSwitcherImg = (ImageView) mSwitcherLayout.findViewById(R.id.switcher_image);
        LayoutParams layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        addView(mSwitcherLayout, layoutParams);
    }

}
