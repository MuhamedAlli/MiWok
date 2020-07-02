package feed.r.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    TextView num , fam , col , phr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (TextView) findViewById(R.id.num);
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this , Numbers.class);
                startActivity(in);
            }
        });
        fam = (TextView)findViewById(R.id.fam);
        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this , Family.class);
                startActivity(in);
            }
        });
        col = (TextView)findViewById(R.id.col);
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this , Colors.class);
                startActivity(in);

            }
        });
        phr = (TextView)findViewById(R.id.phr);
        phr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this , Phrases.class);
                startActivity(in);

            }
        });
    }


}
