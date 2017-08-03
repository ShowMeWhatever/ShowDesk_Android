package com.showdesk.util.image;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Jonguk on 2017. 8. 3..
 */

public class FrescoView extends SimpleDraweeView {

    /**
     * attributes - http://frescolib.org/docs/using-simpledraweeview.html
     * fresco:fadeDuration="300"
     fresco:actualImageScaleType="focusCrop"
     fresco:placeholderImage="@color/wait_color"
     fresco:placeholderImageScaleType="fitCenter"
     fresco:failureImage="@drawable/error"
     fresco:failureImageScaleType="centerInside"
     fresco:retryImage="@drawable/retrying"
     fresco:retryImageScaleType="centerCrop"
     fresco:progressBarImage="@drawable/progress_bar"
     fresco:progressBarImageScaleType="centerInside"
     fresco:progressBarAutoRotateInterval="1000"
     fresco:backgroundImage="@color/blue"
     fresco:overlayImage="@drawable/watermark"
     fresco:pressedStateOverlayImage="@color/red"
     fresco:roundAsCircle="false"
     fresco:roundedCornerRadius="1dp"
     fresco:roundTopLeft="true"
     fresco:roundTopRight="false"
     fresco:roundBottomLeft="false"
     fresco:roundBottomRight="true"
     fresco:roundWithOverlayColor="@color/corner_color"
     fresco:roundingBorderWidth="2dp"
     fresco:roundingBorderColor="@color/border_color"
     */

    public FrescoView(Context context, GenericDraweeHierarchy hierarchy) {
        super(context, hierarchy);
    }

    public FrescoView(Context context) {
        super(context);
    }

    public FrescoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FrescoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public FrescoView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



}
