package org.alanlau.toasty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

/**
 * 基于 GrenderG 的 Toasty 进行一些修改
 *
 * @author Alan Lau
 * @data 2019/8/10
 */

@SuppressLint("InflateParams")
public class Toasty {
    private static Toast lastToast = null;

    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    private Toasty() {
        // avoiding instantiation
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message) {
        return normal(context, context.getString(message), Toast.LENGTH_SHORT, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message) {
        return normal(context, message, Toast.LENGTH_SHORT, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, Drawable icon) {
        return normal(context, context.getString(message), Toast.LENGTH_SHORT, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, Drawable icon) {
        return normal(context, message, Toast.LENGTH_SHORT, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration) {
        return normal(context, context.getString(message), duration, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return normal(context, message, duration, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration,
                               Drawable icon) {
        return normal(context, context.getString(message), duration, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration,
                               Drawable icon) {
        return normal(context, message, duration, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @StringRes int message, int duration,
                               Drawable icon, boolean withIcon) {
        return custom(context, context.getString(message), icon, ToastyUtils.getColor(context, Config.getInstance().normalColor),
                ToastyUtils.getColor(context, Config.getInstance().defaultTextColor), duration, withIcon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration,
                               Drawable icon, boolean withIcon) {
        return custom(context, message, icon, ToastyUtils.getColor(context, Config.getInstance().normalColor),
                ToastyUtils.getColor(context, Config.getInstance().defaultTextColor), duration, withIcon, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @StringRes int message) {
        return warning(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence message) {
        return warning(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @StringRes int message, int duration) {
        return warning(context, context.getString(message), duration, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return warning(context, message, duration, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return custom(context, context.getString(message), ToastyUtils.getDrawable(context, R.drawable.ic_error_outline_white_24dp),
                ToastyUtils.getColor(context, Config.getInstance().warningColor), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_error_outline_white_24dp),
                ToastyUtils.getColor(context, Config.getInstance().warningColor), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @StringRes int message) {
        return info(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence message) {
        return info(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @StringRes int message, int duration) {
        return info(context, context.getString(message), duration, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return info(context, message, duration, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return custom(context, context.getString(message), ToastyUtils.getDrawable(context, R.drawable.ic_info_outline_white_24dp),
                ToastyUtils.getColor(context, Config.getInstance().infoColor), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_info_outline_white_24dp),
                ToastyUtils.getColor(context, Config.getInstance().infoColor), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @StringRes int message) {
        return success(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence message) {
        return success(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @StringRes int message, int duration) {
        return success(context, context.getString(message), duration, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return success(context, message, duration, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return custom(context, context.getString(message), ToastyUtils.getDrawable(context, R.drawable.ic_check_white_24dp),
                ToastyUtils.getColor(context, Config.getInstance().successColor), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_check_white_24dp),
                ToastyUtils.getColor(context, Config.getInstance().successColor), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @StringRes int message) {
        return error(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence message) {
        return error(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @StringRes int message, int duration) {
        return error(context, context.getString(message), duration, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence message, int duration) {
        return error(context, message, duration, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
        return custom(context, context.getString(message), ToastyUtils.getDrawable(context, R.drawable.ic_clear_white_24dp),
                ToastyUtils.getColor(context, Config.getInstance().errorColor), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
        return custom(context, message, ToastyUtils.getDrawable(context, R.drawable.ic_clear_white_24dp),
                ToastyUtils.getColor(context, Config.getInstance().errorColor), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, true);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @StringRes int message, Drawable icon,
                               int duration, boolean withIcon) {
        return custom(context, context.getString(message), icon, -1, ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, false);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence message, Drawable icon,
                               int duration, boolean withIcon) {
        return custom(context, message, icon, -1, ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, false);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @StringRes int message, @DrawableRes int iconRes,
                               @ColorRes int tintColorRes, int duration,
                               boolean withIcon, boolean shouldTint) {
        return custom(context, context.getString(message), ToastyUtils.getDrawable(context, iconRes),
                ToastyUtils.getColor(context, tintColorRes), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, shouldTint);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence message, @DrawableRes int iconRes,
                               @ColorRes int tintColorRes, int duration,
                               boolean withIcon, boolean shouldTint) {
        return custom(context, message, ToastyUtils.getDrawable(context, iconRes),
                ToastyUtils.getColor(context, tintColorRes), ToastyUtils.getColor(context, Config.getInstance().defaultTextColor),
                duration, withIcon, shouldTint);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @StringRes int message, Drawable icon,
                               @ColorRes int tintColorRes, int duration,
                               boolean withIcon, boolean shouldTint) {
        return custom(context, context.getString(message), icon, ToastyUtils.getColor(context, tintColorRes),
                ToastyUtils.getColor(context, Config.getInstance().defaultTextColor), duration, withIcon, shouldTint);
    }

    @CheckResult
    public static Toast custom(@NonNull Context context, @StringRes int message, Drawable icon,
                               @ColorRes int tintColorRes, @ColorRes int textColorRes, int duration,
                               boolean withIcon, boolean shouldTint) {
        return custom(context, context.getString(message), icon, ToastyUtils.getColor(context, tintColorRes),
                ToastyUtils.getColor(context, textColorRes), duration, withIcon, shouldTint);
    }

    @SuppressLint("ShowToast")
    @CheckResult
    public static Toast custom(@NonNull Context context, @NonNull CharSequence message, Drawable icon,
                               @ColorInt int tintColor, @ColorInt int textColor, int duration,
                               boolean withIcon, boolean shouldTint) {
        final Toast currentToast = Toast.makeText(context, "", duration);
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.toast_layout, null);
        final ImageView toastIcon = toastLayout.findViewById(R.id.toast_icon);
        final TextView toastTextView = toastLayout.findViewById(R.id.toast_text);
        Drawable drawableFrame;

        if (shouldTint)
            drawableFrame = ToastyUtils.tint9PatchDrawableFrame(context, tintColor);
        else
            drawableFrame = ToastyUtils.getDrawable(context, R.mipmap.toast_frame);
        ToastyUtils.setBackground(toastLayout, drawableFrame);

        if (withIcon) {
            if (icon == null)
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            ToastyUtils.setBackground(toastIcon, Config.getInstance().tintIcon ? ToastyUtils.tintIcon(icon, textColor) : icon);
        } else {
            toastIcon.setVisibility(View.GONE);
        }

        toastTextView.setText(message);
        toastTextView.setTextColor(textColor);
        toastTextView.setTypeface(Config.getInstance().typeface);
        toastTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, Config.getInstance().textSize);
        //设置背景透明度
        if (Config.getInstance().alpha != -1) {
            toastLayout.getBackground().setAlpha(Config.getInstance().alpha);
        }
        currentToast.setView(toastLayout);
        //设置对齐方式
        if (Config.getInstance().gravity != -1) {
            currentToast.setGravity(Config.getInstance().gravity, Config.getInstance().xOffset, Config.getInstance().yOffset);
        }

        if (!Config.getInstance().allowQueue) {
            if (lastToast != null)
                lastToast.cancel();
            lastToast = currentToast;
        }

        return currentToast;
    }

    public static class Config {
        private Typeface typeface = Typeface.create("sans-serif-condensed", Typeface.NORMAL);
        private int textSize = 16; // in SP
        private boolean tintIcon = true;
        private boolean allowQueue = true;
        private int gravity = -1;
        private int xOffset = 0;
        private int yOffset = 0;
        private int alpha = -1;

        //Toast背景颜色
        private @ColorRes int defaultTextColor = R.color.defaultTextColor;
        private @ColorRes int errorColor = R.color.errorColor;
        private @ColorRes int infoColor = R.color.infoColor;
        private @ColorRes int successColor = R.color.successColor;
        private @ColorRes int warningColor = R.color.warningColor;
        private @ColorRes int normalColor = R.color.normalColor;

        private static Config instance = null;

        private Config() {
            // avoiding instantiation
        }

        //懒汉模式单例
        @CheckResult
        public static Config getInstance() {
            if (null == instance) {
                instance = new Config();
            }
            return instance;
        }

        /**
         * 重置默认设置
         */
        public void reset() {
            typeface = Typeface.create("sans-serif-condensed", Typeface.NORMAL);
            textSize = 16; // in SP
            tintIcon = true;
            allowQueue = true;
            gravity = -1;
            xOffset = 0;
            yOffset = 0;
            alpha = -1;
            //重置背景颜色
            defaultTextColor = R.color.defaultTextColor;
            errorColor = R.color.errorColor;
            infoColor = R.color.infoColor;
            successColor = R.color.successColor;
            warningColor = R.color.warningColor;
            normalColor = R.color.normalColor;
        }

        @CheckResult
        public Config setToastTypeface(@NonNull Typeface typeface) {
            this.typeface = typeface;
            return this;
        }

        @CheckResult
        public Config setTextSize(int sizeInSp) {
            this.textSize = sizeInSp;
            return this;
        }

        @CheckResult
        public Config tintIcon(boolean tintIcon) {
            this.tintIcon = tintIcon;
            return this;
        }

        @CheckResult
        public Config allowQueue(boolean allowQueue) {
            this.allowQueue = allowQueue;
            return this;
        }

        @CheckResult
        public Config setGravity(int gravity) {
            this.gravity = gravity;
            return this;
        }

        @CheckResult
        public Config setOffset(int x, int y) {
            this.xOffset = x;
            this.yOffset = y;
            return this;
        }

        @CheckResult
        public Config setXOffset(int x) {
            this.xOffset = x;
            return this;
        }

        @CheckResult
        public Config setYOffset(int y) {
            this.yOffset = y;
            return this;
        }

        @CheckResult
        public Config setAlpah(@IntRange(from = 0, to = 255) int alpha) {
            this.alpha = alpha;
            return this;
        }

        @CheckResult
        public Config setDefaultTextColor(@ColorRes int color) {
            this.defaultTextColor = color;
            return this;
        }

        @CheckResult
        public Config setErrorColor(@ColorRes int color) {
            this.errorColor = color;
            return this;
        }

        @CheckResult
        public Config setInfoColor(@ColorRes int color) {
            this.infoColor = color;
            return this;
        }

        @CheckResult
        public Config setSuccessColor(@ColorRes int color) {
            this.successColor = color;
            return this;
        }

        @CheckResult
        public Config setWarningColor(@ColorRes int color) {
            this.warningColor = color;
            return this;
        }

        @CheckResult
        public Config setNormalColor(@ColorRes int color) {
            this.normalColor = color;
            return this;
        }
    }
}

