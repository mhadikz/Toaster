package com.mhadikz.toaster;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;

public class Toaster extends Toast{

    private final String title;
    private final String description;
    private final int duration;
    private final Status status;
    private final Context context;


    public static class Builder {

        private String title;
        private String description;
        private int duration;
        private Status status;
        private Context context;

        public Builder(@NonNull Context context) {
            this.context = context;
        }

        private void generateMessage() {
            Toast toast = new Toast(context);
            Utils utils = new Utils(status, context);
            View toastLayout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null, false);

            TextView title = toastLayout.findViewById(R.id.title);
            TextView description = toastLayout.findViewById(R.id.description);
            ImageView icon = toastLayout.findViewById(R.id.icon);
            RelativeLayout toastContainer = toastLayout.findViewById(R.id.toast_container);

            toastContainer.setBackground(utils.setStatusBackground());
            icon.setImageDrawable(utils.setStatusIcon());

            title.setText(this.title);
            description.setText(this.description);

            toast.setView(toastLayout);
            toast.setDuration(duration);

            toast.show();
        }



        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        public Toaster show() {
            generateMessage();
            return new Toaster(this);
        }
    }

    private Toaster(Builder builder) {
        super(builder.context);
        this.title = builder.title;
        this.description = builder.description;
        this.duration = builder.duration;
        this.status = builder.status;
        this.context = builder.context;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public Status getStatus() {
        return status;
    }

    public Context getContext() {
        return context;
    }

    public enum Status {
        INFO,
        SUCCESS,
        WARNING,
        ERROR
    }


}
