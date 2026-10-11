package com.kestreldock.app;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;

public final class MainActivity extends Activity {
    private static final String APP_URL = "https://kestreldock.onrender.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            new TrustedWebActivityIntentBuilder(Uri.parse(APP_URL))
                    .build()
                    .launch(this);
        } catch (RuntimeException error) {
            Toast.makeText(this, "Unable to open KestrelDock", Toast.LENGTH_LONG).show();
        }
    }
}
