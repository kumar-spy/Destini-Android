package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button top_button;
    private Button bottom_button;
    private TextView story_view;
    private int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        top_button=(Button)findViewById(R.id.buttonTop);
        bottom_button=(Button)findViewById(R.id.buttonBottom);
        story_view = (TextView)findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    story_view.setText(R.string.T3_Story);
                    top_button.setText(R.string.T3_Ans1);
                    bottom_button.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;

                } else if (mStoryIndex == 3) {
                    story_view.setText(R.string.T3_Story);
                    top_button.setVisibility(View.GONE);
                    bottom_button.setVisibility(View.GONE);
                }
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1){
                    story_view.setText(R.string.T2_Story);
                    top_button.setText(R.string.T2_Ans1);
                    bottom_button.setText(R.string.T2_Ans2);
                    mStoryIndex=2;

                }else if(mStoryIndex==2){
                    story_view.setText(R.string.T4_End);
                    top_button.setVisibility(View.GONE);
                    bottom_button.setVisibility(View.GONE);
                }else if(mStoryIndex==3){
                    story_view.setText(R.string.T5_End);
                    top_button.setVisibility(View.GONE);
                    bottom_button.setVisibility(View.GONE);
                }

            }
        });


    }
}
