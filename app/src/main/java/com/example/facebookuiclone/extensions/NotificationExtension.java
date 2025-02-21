package com.example.facebookuiclone.extensions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.facebookuiclone.R;
import com.example.facebookuiclone.models.NotificationModel;

import java.util.List;

public class NotificationExtension extends RecyclerView.Adapter<NotificationExtension.ViewHolder> {

    private List<NotificationModel> notificationList;

    public NotificationExtension(List<NotificationModel> notificationList) {
        this.notificationList = notificationList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NotificationModel notification = notificationList.get(position);
        holder.tvNotificationText.setText(notification.getNotificationText());
        holder.tvNotificationTime.setText(notification.getNotificationTime());
        holder.imgProfile.setImageResource(notification.getProfileImage());
    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNotificationText, tvNotificationTime;
        ImageView imgProfile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNotificationText = itemView.findViewById(R.id.tvNotificationText);
            tvNotificationTime = itemView.findViewById(R.id.tvNotificationTime);
            imgProfile = itemView.findViewById(R.id.imgProfile);
        }
    }
}
