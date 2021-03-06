package com.custom.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.custom.view.R;
import com.custom.view.activity.base.BaseActivity;
import com.custom.view.activity.view.AutoScrollTextViewActivity;
import com.custom.view.activity.view.BadgeViewActivity;
import com.custom.view.activity.view.BlurringViewActivity;
import com.custom.view.activity.view.CircleImageViewActivity;
import com.custom.view.activity.view.CountTimeProgressViewActivity;
import com.custom.view.activity.view.FlipperViewActivity;
import com.custom.view.activity.view.FlowRadioGroupActivity;
import com.custom.view.activity.view.PuzzleViewActivity;
import com.custom.view.activity.view.RadarViewActivity;
import com.custom.view.activity.view.StarLevelViewActivity;
import com.custom.view.activity.view.StepViewActivity;
import com.custom.view.activity.view.TimerViewActivity;
import com.custom.view.activity.view.UnlockViewActivity;
import com.custom.view.activity.view.WaveViewActivity;

public class MainActivity extends BaseActivity {

    // ListView
    private ListView lstView = null;

    // Values
    private CustomView[] VALUES = {
            new CustomView(R.string.view_title_unlockView, R.string.view_introduction_unlockView, UnlockViewActivity.class),
            new CustomView(R.string.view_title_starLevelView, R.string.view_introduction_starLevelView, StarLevelViewActivity.class),
            new CustomView(R.string.view_title_timerView, R.string.view_introduction_timerView, TimerViewActivity.class),
            new CustomView(R.string.view_title_flowRadioGroup, R.string.view_introduction_flowRadioGroup, FlowRadioGroupActivity.class),
            new CustomView(R.string.view_title_puzzleView, R.string.view_introduction_puzzleView, PuzzleViewActivity.class),
            new CustomView(R.string.view_title_autoHorizontalScrollTextView, R.string.view_introduction_autoHorizontalScrollTextView, AutoScrollTextViewActivity.class),
            new CustomView(R.string.view_title_waveView, R.string.view_introduction_waveView, WaveViewActivity.class),
            new CustomView(R.string.view_title_badgeView, R.string.view_introduction_badgeView, BadgeViewActivity.class),
            new CustomView(R.string.view_title_circleImageView, R.string.view_introduction_circleImageView, CircleImageViewActivity.class),
            new CustomView(R.string.view_title_countTimeProgressView, R.string.view_introduction_countTimeProgressView, CountTimeProgressViewActivity.class),
            new CustomView(R.string.view_title_blurringView, R.string.view_introduction_blurringView, BlurringViewActivity.class),
            new CustomView(R.string.view_title_flipperView, R.string.view_introduction_flipperView, FlipperViewActivity.class),
            new CustomView(R.string.view_title_radarView, R.string.view_introduction_radarView, RadarViewActivity.class),
            new CustomView(R.string.view_title_stepView, R.string.view_introduction_stepView, StepViewActivity.class)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.init();
    }

    private void init() {
        lstView = (ListView) findViewById(R.id.lst_view);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, VALUES[position].getViewClass());
                MainActivity.this.startActivity(intent);
            }
        });

        lstView.setAdapter(new DefaultAdapter(this, VALUES));
    }
}
