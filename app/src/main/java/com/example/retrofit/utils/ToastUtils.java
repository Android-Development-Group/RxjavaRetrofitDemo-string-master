package com.example.retrofit.utils;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofit.R;

/**
 * Android Toast 封装
 * Created by guchenkai on 2015/11/6.
 */
public final class ToastUtils {

    private static Toast mToast;

    public static void showToastLong(Context context, String msg) {
        if (!TextUtils.isEmpty(msg))
            showNoRepeatToast(context, msg, Toast.LENGTH_LONG);
        //      showToast(context, msg, Toast.LENGTH_LONG);
    }

    public static void showToastShort(Context context, String msg) {
//        showToast(context, msg, Toast.LENGTH_SHORT);
        if (!TextUtils.isEmpty(msg))
            showNoRepeatToast(context, msg);
    }

    public static void showToastShort(Context context, int strRes) {
        showToast(context, context.getString(strRes), Toast.LENGTH_SHORT);
    }

    public static void showToastLong(Context context, int strRes) {
        showToast(context, context.getString(strRes), Toast.LENGTH_LONG);
    }

    public static void showToast(Context context, String msg, int duration) {
        if (!TextUtils.isEmpty(msg))
            Toast.makeText(context, msg, duration).show();
    }

    public static void showNoRepeatToast(Context context, String msg) {
        if (!TextUtils.isEmpty(msg))
            showNoRepeatToast(context, msg, Toast.LENGTH_SHORT);
    }

    public static void showNoRepeatToast(Context context, String msg, int duration) {
        if (!TextUtils.isEmpty(msg))
            if (mToast == null) {
                mToast = Toast.makeText(context.getApplicationContext(), msg, duration);
            }
        mToast.setText(msg);
        mToast.show();
    }

    public static void showCustomToast(Context context, @NonNull String msg, @DrawableRes int strRes) {
        if (mToast == null) {
            mToast = Toast.makeText(context.getApplicationContext(), msg, Toast.LENGTH_SHORT);
        }
        View view = View.inflate(context, R.layout.layout_custom_toast, null);
        ImageView iv_toast_img = (ImageView) view.findViewById(R.id.iv_toast_img);
        TextView tv_toast_desc = (TextView) view.findViewById(R.id.tv_toast_desc);

        if (!TextUtils.isEmpty(msg) && !TextUtils.equals("null", msg))
            tv_toast_desc.setText(msg);
        if (strRes != 0)
            iv_toast_img.setImageResource(strRes);

        mToast.setView(view);
        mToast.show();
    }

}
