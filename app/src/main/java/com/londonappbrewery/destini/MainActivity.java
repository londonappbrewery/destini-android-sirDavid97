package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button topButton;
    Button bottomButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mStory.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if(mStoryIndex > 1 && mStoryIndex < 4) {
                    mStory.setText(R.string.T4_End);
                    topButton.setText(R.string.T5_End);
                    bottomButton.setText(R.string.T6_End);
                    mStoryIndex = 4;
                }
                else {
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mStory.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if(mStoryIndex > 1 && mStoryIndex < 4) {
                    mStory.setText(R.string.T4_End);
                    topButton.setText(R.string.T5_End);
                    bottomButton.setText(R.string.T6_End);
                    mStoryIndex = 4;
                }
                else {
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
            }
        });


    }
}
