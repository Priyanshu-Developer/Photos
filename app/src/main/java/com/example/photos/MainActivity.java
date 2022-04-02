package com.example.photos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int[] arr;
    ImageView image;
    int index;
    Button prev,next;
    TextView inde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        index=0;
        arr = new int[]{R.drawable.apple, R.drawable.butterfly, R.drawable.egal, R.drawable.rose};
        prev=findViewById(R.id.button);
        next=findViewById(R.id.button2);
        image=findViewById(R.id.imageView2);
        inde=findViewById(R.id.textView2);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (index>0){
                        index-=1;
                        inde.setText(String.valueOf(index));
                        image.setImageResource(arr[index]);

                    }

                }
                catch (Exception  e){
                    e.printStackTrace();
                }


                }




        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (index < 4) {
                        inde.setText(String.valueOf(index));
                        image.setImageResource(arr[index]);
                        index += 1;
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

            }

        });

    }
}