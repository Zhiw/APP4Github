package com.zhiw.app4github.common.wrapper;

import com.bumptech.glide.Glide;

import android.content.Context;
import android.widget.ImageView;

/**
 * ClassName: ImageLoader
 * Desc:
 * Created by zhiw on 16/9/11.
 */

public class ImageLoader {

    public static void load(Context context, Object source, ImageView imageView){
        Glide.with(context)
                .load(source)
                .centerCrop()
                .into(imageView);
    }

}
