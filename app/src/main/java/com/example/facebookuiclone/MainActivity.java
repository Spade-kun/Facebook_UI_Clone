package com.example.facebookuiclone;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.example.facebookuiclone.NewsFeedFragment;
import com.example.facebookuiclone.NotificationFragment;
import com.example.facebookuiclone.MenuFragment;
import com.example.facebookuiclone.VideoFragment;
import com.example.facebookuiclone.MarketplaceFragment;
import com.example.facebookuiclone.GamingFragment;

public class MainActivity extends AppCompatActivity {

    private ImageView navNewsFeed, navNotifications, navMenu, navVideo, navMarketplace, navGaming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize navigation buttons
        navNewsFeed = findViewById(R.id.nav_news_feed);
        navNotifications = findViewById(R.id.nav_notifications);
        navMenu = findViewById(R.id.nav_menu);
        navVideo = findViewById(R.id.nav_video);
        navMarketplace = findViewById(R.id.nav_marketplace);
        navGaming = findViewById(R.id.nav_gaming);

        // Set default fragment to NewsFeedFragment
        loadFragment(new NewsFeedFragment());

        // Handle navigation button clicks
        navNewsFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new NewsFeedFragment());
            }
        });

        navNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new NotificationFragment());
            }
        });

        navMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new MenuFragment());
            }
        });

        navVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new VideoFragment()); // ✅ Now opens Video Fragment
            }
        });

        navMarketplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new MarketplaceFragment()); // ✅ Now opens Marketplace Fragment
            }
        });

        navGaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new GamingFragment()); // ✅ Now opens Gaming Fragment
            }
        });
    }

    // Method to load fragments dynamically
    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}