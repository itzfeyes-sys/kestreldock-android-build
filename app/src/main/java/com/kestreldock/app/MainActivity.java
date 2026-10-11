package com.kestreldock.app;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.browser.customtabs.CustomTabsIntent;

public final class MainActivity extends Activity {
    private static final String APP_URL = "https://kestreldock.onrender.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            new CustomTabsIntent.Builder()
                    .setShowTitle(true)
                    .build()
                    .launchUrl(this, Uri.parse(APP_URL));
        } catch (RuntimeException error) {
            Toast.makeText(this, "Unable to open KestrelDock. Please check your browser.", Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
