package com.tetblocks.tetb1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    LinearLayout ln1, lln [],controller, space_between_game_board_and_controller, controller2;
    LinearLayout.LayoutParams parms, controller_parms;
    ImageView iv [] [],right_arrow, left_arrow,  turn_arrow, down_arrow, double_down_arrow ;
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


        // Butonların ve gameboardın yerleri aşağıdaki methodlar ile yapılmıştır

        game_board(70,70);
        space_between_game_board_and_controller(100);
        controller();
        space_between_game_board_and_controller(100);
        controller2();



        timer1();


            right_arrow.setOnTouchListener(new View.OnTouchListener() {
                @SuppressLint("ClickableViewAccessibility")
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch(event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            //sqr.setBackgroundColor(Color.RED);
                            Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            vibe.vibrate(100);
                            //vibe.vibrate(100);
                            right_arrow.setImageResource(R.drawable.red_right_arrow);
                            return true;
                        case MotionEvent.ACTION_UP:


                            right_arrow.setImageResource(R.drawable.right_arrow);
                            // sqr.setBackgroundColor(Color.parseColor("#17615B"));




                            // process("/");
                            return true;
                    }
                    return false;
                }
            });




        /*
         right_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg_box("Right Arrow");

            }
        });
         */


        left_arrow.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        //sqr.setBackgroundColor(Color.RED);
                        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        vibe.vibrate(100);
                        //vibe.vibrate(100);
                        left_arrow.setImageResource(R.drawable.red_left_arrow);
                        return true;
                    case MotionEvent.ACTION_UP:


                        left_arrow.setImageResource(R.drawable.left_arrow);
                        // sqr.setBackgroundColor(Color.parseColor("#17615B"));




                        // process("/");
                        return true;
                }
                return false;
            }
        });

        /*
         left_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            msg_box("Left Arrow");

            }
        });
         */


        turn_arrow.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        //sqr.setBackgroundColor(Color.RED);
                        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        vibe.vibrate(100);
                        //vibe.vibrate(100);
                        turn_arrow.setImageResource(R.drawable.red_repeat);
                        return true;
                    case MotionEvent.ACTION_UP:


                        turn_arrow.setImageResource(R.drawable.repeat);
                        // sqr.setBackgroundColor(Color.parseColor("#17615B"));




                        // process("/");
                        return true;
                }
                return false;
            }
        });


        /*
         turn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg_box("Turn Arrow");

            }
        });
         */


        down_arrow.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        //sqr.setBackgroundColor(Color.RED);
                        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        vibe.vibrate(100);
                        //vibe.vibrate(100);
                        down_arrow.setImageResource(R.drawable.red_down_arrow);
                        return true;
                    case MotionEvent.ACTION_UP:


                        down_arrow.setImageResource(R.drawable.down_arrow);
                        // sqr.setBackgroundColor(Color.parseColor("#17615B"));


                        // process("/");
                        return true;
                }
                return false;
            }
        });


        /*
        down_arrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        msg_box("Down Arrow");

                    }
                });
         */


        double_down_arrow.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        //sqr.setBackgroundColor(Color.RED);
                        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        vibe.vibrate(100);
                        //vibe.vibrate(100);
                        double_down_arrow.setImageResource(R.drawable.red_doublearrow);
                        return true;
                    case MotionEvent.ACTION_UP:


                        double_down_arrow.setImageResource(R.drawable.doublearrow);
                        // sqr.setBackgroundColor(Color.parseColor("#17615B"));


                        // process("/");
                        return true;
                }
                return false;
            }
        });



        /*
         double_down_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg_box("Double Down Arrow");

            }
        });
         */


    }


    public void msg_box(String msg)
    {

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(msg);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });




        alertDialog.show();

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

        down_arrow();
        between_arrows(200,200);
        double_down_arrow();


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
        left_arrow= new ImageView(this);
        left_arrow.setImageResource(R.drawable.left_arrow);
        controller.addView(left_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        left_arrow.setLayoutParams(controller_parms);
    }

    public void turn_arrow()
    {
        turn_arrow= new ImageView(this);
        turn_arrow.setImageResource(R.drawable.repeat);
        controller.addView(turn_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        turn_arrow.setLayoutParams(controller_parms);
    }

    public void right_arrow()
    {
        right_arrow= new ImageView(this);
        right_arrow.setImageResource(R.drawable.right_arrow);
        controller.addView(right_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        right_arrow.setLayoutParams(controller_parms);
    }



      public void down_arrow()
    {
        down_arrow= new ImageView(this);
        down_arrow.setImageResource(R.drawable.down_arrow);
        controller.addView(down_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        down_arrow.setLayoutParams(controller_parms);
    }

    public void double_down_arrow()
    {
        double_down_arrow= new ImageView(this);
        double_down_arrow.setImageResource(R.drawable.doublearrow);
        controller.addView(double_down_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        double_down_arrow.setLayoutParams(controller_parms);
    }





}

