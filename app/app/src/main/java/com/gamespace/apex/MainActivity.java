package com.gamespace.apex;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(12, 15, 25));

        TextView title = new TextView(this);
        title.setText("GAME SPACE APEX");
        title.setTextSize(28);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("ANDROID GRAPHICS CONTROL");
        subtitle.setTextColor(Color.GRAY);
        subtitle.setGravity(Gravity.CENTER);

        Button graphics = new Button(this);
        graphics.setText("GRAPHICS SETTINGS");

        Button shizuku = new Button(this);
        shizuku.setText("SHIZUKU STATUS");

        TextView status = new TextView(this);
        status.setText("SYSTEM READY");
        status.setTextColor(Color.GREEN);
        status.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(graphics);
        layout.addView(shizuku);
        layout.addView(status);

        setContentView(layout);
    }
}
