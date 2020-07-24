package com.mhadikz.toaster;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.mhadikz.toaster.Toaster.Status;

class Utils {

    Status status;
    Context context;

    public Utils(Status status, Context context) {
        this.status = status;
        this.context = context;
    }

    protected Drawable setStatusBackground() {
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.info_background);

        switch (status) {
            case INFO:
                drawable = ContextCompat.getDrawable(context, R.drawable.info_background);
                break;
            case SUCCESS:
                drawable = ContextCompat.getDrawable(context, R.drawable.success_background);
                break;
            case WARNING:
                drawable = ContextCompat.getDrawable(context, R.drawable.warning_background);
                break;
            case ERROR:
                drawable = ContextCompat.getDrawable(context, R.drawable.error_background);
                break;
        }
        return drawable;
    }

    protected Drawable setStatusIcon() {
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.ic_info);

        switch (status) {
            case INFO:
                drawable = ContextCompat.getDrawable(context, R.drawable.ic_info);
                break;
            case SUCCESS:
                drawable = ContextCompat.getDrawable(context, R.drawable.ic_success);
                break;
            case WARNING:
                drawable = ContextCompat.getDrawable(context, R.drawable.ic_warning);
                break;
            case ERROR:
                drawable = ContextCompat.getDrawable(context, R.drawable.ic_error);
                break;
        }
        return drawable;
    }

}
