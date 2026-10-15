
package com.fuelfit.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int dp(float value) {
        return (int) (value * getResources()
                .getDisplayMetrics().density);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(24), dp(36), dp(24), dp(24));
        root.setBackgroundColor(Color.rgb(18, 24, 32));

        TextView title = new TextView(this);
        title.setText("FuelFit");
        title.setTextSize(32);
        title.setTextColor(Color.rgb(100, 230, 160));
        title.setGravity(Gravity.CENTER);
        root.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your fitness journey starts here");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, dp(8), 0, dp(28));
        root.addView(subtitle);

        addCard(root, "Nutrition",
                "Track your meals and daily macros");
        addCard(root, "Workout",
                "Record exercises, sets and reps");
        addCard(root, "Water",
                "Keep track of your water intake");
        addCard(root, "Progress",
                "Record your weight and goals");

        setContentView(root);
    }

    private void addCard(LinearLayout root,
                         String heading, String description) {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(dp(16), dp(16), dp(16), dp(16));
        card.setBackgroundColor(Color.rgb(35, 45, 55));

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        -1, -2);
        params.bottomMargin = dp(14);

        TextView title = new TextView(this);
        title.setText(heading);
        title.setTextSize(20);
        title.setTextColor(Color.rgb(100, 230, 160));

        TextView detail = new TextView(this);
        detail.setText(description);
        detail.setTextSize(14);
        detail.setTextColor(Color.WHITE);
        detail.setPadding(0, dp(6), 0, 0);

        card.addView(title);
        card.addView(detail);
        root.addView(card, params);
    }
}
