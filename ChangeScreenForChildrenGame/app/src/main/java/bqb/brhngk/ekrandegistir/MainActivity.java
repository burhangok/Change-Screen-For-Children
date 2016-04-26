package bqb.brhngk.ekrandegistir;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {




    Button dugme;
    RelativeLayout govde;
    public float j,k;
    Integer [ ]   resimID   =   {R . drawable . resim1,R . drawable . resim2 , R . drawable . resim3 ,
            R . drawable . resim4 , R . drawable . resim5 ,R . drawable . resim6 , R . drawable . resim7 ,
            R . drawable . resim8 ,R . drawable . resim9 , R.drawable.resim10} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        govde = (RelativeLayout) findViewById(R.id.ekran);
        dugme= (Button) findViewById(R.id.buton);
        Display display = getWindowManager().getDefaultDisplay();
        //    Point size = new  Point ();
        //  display.getSize(size);
        final float width =display.getWidth();
        final float height = display.getHeight();

        dugme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                j =  (float)(Math.random()*width);

                k =  (float)Math.random()*height;
                dugme.setX(j);
                dugme.setY(k);

                int i= (int)(Math.random()*10);
                switch (i) {
                    case 1: govde.setBackgroundResource(resimID [1]);
                        break;
                    case  2 : govde.setBackgroundResource(resimID [2]);
                        break;
                    case 3 : govde.setBackgroundResource(resimID [3]);
                        break;
                    case 4 : govde.setBackgroundResource(resimID [4]);
                        break;
                    case 5 : govde.setBackgroundResource(resimID [5]);
                        break;
                    case 6: govde.setBackgroundResource(resimID [6]);
                        break;
                    case 7: govde.setBackgroundResource(resimID [7]);
                        break;
                    case  8 : govde.setBackgroundResource(resimID [8]);
                        break;
                    case 9 : govde.setBackgroundResource(resimID [9]);
                        break;
                    case 10 : govde.setBackgroundResource(resimID [10]);
                        break;
                }

            }
        });
    }



}
