package com.tetblocks.tetb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;




public class MainActivity extends AppCompatActivity {

    LinearLayout ln1, lln [],controller, space_between_game_board_and_controller, controller2;
    LinearLayout.LayoutParams parms, controller_parms;
    ImageView iv [] [],right_arrow;
    LinearLayout.LayoutParams lp1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        
        ln1 = findViewById(R.id.ln1);



       lp1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT
        );

        ln1.setOrientation(LinearLayout.VERTICAL);


        game_board(70,70);
        timer1();
        space_between_game_board_and_controller(100);
        controller();
        space_between_game_board_and_controller(100);
        controller2();

    }



    public void timer1()
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




    public void game_board(int Width, int Height)
    {
        lln  = new LinearLayout[20];
        parms = new LinearLayout.LayoutParams(Width,Height);
        iv  = new ImageView[10] [20];




        for(int i=0;i<lln.length;i++)
        {

            lln [i] = new LinearLayout(this);
            ln1.addView(lln[i],lp1);

            lln [i].setOrientation(LinearLayout.HORIZONTAL);
            lln[i].setGravity(Gravity.CENTER);


            /* game boardı merkeze almak için lln[i].setGravity(Gravity.CENTER); kullanılıyor

            lp1 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT
            );

            olmalı

             lp1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
        );

            değil.
             */


            for(int y=0;y<iv.length;y++)
            {
                iv [y] [i]= new ImageView(this);
                iv [y] [i].setImageResource(R.drawable.tet2);
                lln[i].addView(iv[y][i], lp1);
                iv[y][i].setLayoutParams(parms);

            }


        }
    }


    public void controller()
    {
        controller  = new LinearLayout(this);
        ln1.addView(controller,lp1);
        controller.setOrientation(LinearLayout.HORIZONTAL);
        controller.setGravity(Gravity.CENTER);

        left_arrow();
        between_arrows(200,200);
        turn_arrow();
        between_arrows(200,200);
        right_arrow();

    }

    public void controller2()
    {
        controller  = new LinearLayout(this);
        ln1.addView(controller,lp1);
        controller.setOrientation(LinearLayout.HORIZONTAL);
        controller.setGravity(Gravity.CENTER);

        left_arrow();
        between_arrows(200,200);
        turn_arrow();

       /*
          between_arrows(200,200);
        right_arrow();
        */


    }



    public void space_between_game_board_and_controller(int Height)
    {
        //space_between_game_board_and_controller
                space_between_game_board_and_controller  = new LinearLayout(this);
        LinearLayout.LayoutParams space_between_game_board_and_controller_parms = new LinearLayout.LayoutParams(2500,Height);
        ln1.addView(space_between_game_board_and_controller,space_between_game_board_and_controller_parms);
        space_between_game_board_and_controller.setOrientation(LinearLayout.HORIZONTAL);
    }

    public void between_arrows(int Width,int Height)
    {

        LinearLayout between_arrows  = new LinearLayout(this);
        LinearLayout.LayoutParams between_arrows_parms = new LinearLayout.LayoutParams(Width,Height);
        controller.addView(between_arrows,between_arrows_parms);
        between_arrows.setOrientation(LinearLayout.HORIZONTAL);


    }


    public void left_arrow()
    {
        right_arrow= new ImageView(this);
        right_arrow.setImageResource(R.drawable.arrow);
        controller.addView(right_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        right_arrow.setLayoutParams(controller_parms);
    }

    public void turn_arrow()
    {
        right_arrow= new ImageView(this);
        right_arrow.setImageResource(R.drawable.arrow);
        controller.addView(right_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        right_arrow.setLayoutParams(controller_parms);
    }

    public void right_arrow()
    {
        right_arrow= new ImageView(this);
        right_arrow.setImageResource(R.drawable.arrow);
        controller.addView(right_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        right_arrow.setLayoutParams(controller_parms);
    }





    /*
      public void down_arrow3()
    {
        right_arrow= new ImageView(this);
        right_arrow.setImageResource(R.drawable.arrow);
        controller.addView(right_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        right_arrow.setLayoutParams(controller_parms);
    }

    public void down_arrow4()
    {
        right_arrow= new ImageView(this);
        right_arrow.setImageResource(R.drawable.arrow);
        controller.addView(right_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        right_arrow.setLayoutParams(controller_parms);
    }

     */



}

