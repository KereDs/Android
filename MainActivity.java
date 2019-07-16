package com.example.arfooooood;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt;
    String s3;
    //int a=0;
    private int n=0;
    private Runnable r1 = new Runnable(){
        public void run()
        {
            if(n==1)
            {
                Intent intent2 = new Intent();
                intent2.setClass(MainActivity.this, layout2.class);
                startActivity(intent2);
            }

        }
    };
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    Intent intent = getPackageManager().getLaunchIntentForPackage("com.arfood.arfood");
                    /*Bundle bundle = new Bundle();
                    bundle.putString("inputs3",s3);
                    intent.putExtras(bundle);*/
                    startActivity(intent);
                    setN(n);
            }
            public int setN(int a) {
                a=1;
                n=a;
                return n;
            }
        });
        Thread t1 = new Thread(r1);
        t1.start();
        //change(n);
        /*if(n==1)
        {
            n=0;
            Intent intent2 = new Intent();
            intent2.setClass(MainActivity.this, layout2.class);
            startActivity(intent2);
        }*/

    }
    /*protected void change(int n)
    {
        if(n==1)
        {
            n=0;
            Intent intent2 = new Intent();
            intent2.setClass(MainActivity.this, layout2.class);
            startActivity(intent2);
        }
    }*/
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==1&&resultCode==RESULT_CANCELED&&n==1){
            Intent intent2 = new Intent();
            intent2.setClass(MainActivity.this, layout2.class);
            startActivity(intent2);
        }
    }*/
}
