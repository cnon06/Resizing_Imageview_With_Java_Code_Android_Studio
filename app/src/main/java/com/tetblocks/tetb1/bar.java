package com.tetblocks.tetb1;

public class bar //extends MainActivity
{

MainActivity ma1 = new MainActivity();

    public  void horizontal_bar()
    {

        ma1.max_right=6;

        for(int y=0;y<ma1.coords.length;y++) {

            for (int x = 0; x < ma1.coords[0].length; x++) {

                //if(x>=apsis && x<=apsis+3 && y>=ordinate &&  y<= ordinate) coords[y][x]=false;
                if(x>=ma1.first && x<=ma1.first+3 && y>=ma1.vertical &&  y<= ma1.vertical) ma1.coords[y][x]=false;
                else  ma1.coords[y][x]=true;
            }

        }

    }



    public  void vertical_bar()
    {

        ma1.max_right=9;

        for(int y=0;y<ma1.coords.length;y++) {

            for (int x = 0; x < ma1.coords[0].length; x++) {

                // if(x>=apsis && x<=apsis && y>=ordinate &&  y<= ordinate+3) coords[y][x]=false;
                if(x>=ma1.first+1+1 && x<=ma1.first+1+1 && y>=ma1.vertical-2 &&  y<= ma1.vertical+3-2) ma1.coords[y][x]=false;
                else  ma1.coords[y][x]=true;
            }

        }

    }

}
