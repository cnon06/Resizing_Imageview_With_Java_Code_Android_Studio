package com.tetblocks.tetb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;




public class MainActivity extends AppCompatActivity {

    LinearLayout ln1;
    LinearLayout.LayoutParams parms;
    ImageView iv [] [];
    LinearLayout.LayoutParams lp1;
    LinearLayout lln [];




    public void rew()
    {
        new Thread(){

            @Override
            public void run() {

                int i=0;

                try
                {

                    while (i<20)
                    {
                        sleep(1000);
                        Log.d("",i+"");

                        for(int x=3;x<7;x++)
                        {
                            iv [x] [i].setImageResource(R.drawable.tet1);
                            if(i>0)   iv [x] [i-1].setImageResource(R.drawable.tet2);
                        }


                        i++;
                    }

                }
                catch (Exception ed)
                {
                    System.out.println("Error code 10:"+ed);
                }
            }
        }.start();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ln1 = findViewById(R.id.ln1);


       lp1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
        );

        ln1.setOrientation(LinearLayout.VERTICAL);


         lln  = new LinearLayout[20];


         parms = new LinearLayout.LayoutParams(65,65);

         iv  = new ImageView[10] [20];



        for(int i=0;i<lln.length;i++)
        {

            lln [i] = new LinearLayout(this);
            ln1.addView(lln[i],lp1);
            lln [i].setOrientation(LinearLayout.HORIZONTAL);


            for(int y=0;y<iv.length;y++)
            {
                iv [y] [i]= new ImageView(this);
                iv [y] [i].setImageResource(R.drawable.tet2);
                lln[i].addView(iv[y][i], lp1);
                iv[y][i].setLayoutParams(parms);

            }


        }




        rew();



    }
}