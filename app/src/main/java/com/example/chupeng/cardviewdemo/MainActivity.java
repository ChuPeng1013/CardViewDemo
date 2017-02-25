package com.example.chupeng.cardviewdemo;
/**
 * Created by ChuPeng on 2017/2/25.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity
{
    private CardView cardView;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        cardView = (CardView) findViewById(R.id.cardView);

        cardView.setOnTouchListener(new View.OnTouchListener()
        {
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                switch (motionEvent.getAction())
                {
                    //当手指按下CardView
                    case MotionEvent.ACTION_DOWN:
                        cardView.setCardElevation(0);
                        break;
                    //当手指松开CardView
                    case MotionEvent.ACTION_UP:
                        cardView.setCardElevation(20);
                        break;
                }
                return true;
            }
        });
    }
}
