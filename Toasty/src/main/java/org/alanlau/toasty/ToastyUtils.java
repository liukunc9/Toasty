package org.alanlau.toasty;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.content.res.AppCompatResources;
import android.view.View;

/**
 * @author Alan Lau
 * @data 2019/8/10
 */
final class ToastyUtils {
    private ToastyUtils() {
    }

    static Drawable tintIcon(@NonNull Drawable drawable, @ColorInt int tintColor) {
        drawable.setColorFilter(tintColor, PorterDuff.Mode.SRC_IN);
        return drawable;
    }

    static Drawable tint9PatchDrawableFrame(@NonNull Context context, @ColorInt int tintColor) {
        final NinePatchDrawable toastDrawable = (NinePatchDrawable) getDrawable(context, R.mipmap.toast_frame);
        return tintIcon(toastDrawable, tintColor);
    }

    static void setBackground(@NonNull View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
            view.setBackground(drawable);
        else
            view.setBackgroundDrawable(drawable);
    }

    static Drawable getDrawable(@NonNull Context context, @DrawableRes int id) {
        return AppCompatResources.getDrawable(context, id);
    }

    static int getColor(@NonNull Context context, @ColorRes int color){
        return ContextCompat.getColor(context, color);
    }
}
