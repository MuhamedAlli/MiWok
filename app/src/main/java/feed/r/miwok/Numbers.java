package feed.r.miwok;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Numbers extends AppCompatActivity {
     ArrayList<Word> words = new ArrayList<Word>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        lv = (ListView)findViewById(R.id.lv);


        words.add(new Word("One" , "Lutti" , R.drawable.number_one  , R.raw.number_one));
        words.add(new Word("Tow" , "Otiiko",R.drawable.number_two , R.raw.number_two));
        words.add(new Word("Three" , "Tolookosu",R.drawable.number_three , R.raw.number_three ));
        words.add(new Word("Four" , "Oyissa", R.drawable.number_four  , R.raw.number_four));
        words.add(new Word("Five" , "Massokka",R.drawable.number_five  , R.raw.number_five));
        words.add(new Word("Six" , "Temmokka", R.drawable.number_six , R.raw.number_six));
        words.add(new Word("Seven" , "Kenekaku", R.drawable.number_seven , R.raw.number_seven));
        words.add(new Word("Eight" , "Kawinta", R.drawable.number_eight , R.raw.number_eight));
        words.add(new Word("Nine" , "Wo'e", R.drawable.number_nine , R.raw.number_nine));
        words.add(new Word("Ten" , "Na'aacha", R.drawable.number_ten , R.raw.number_ten));

        MyAdapter arr = new MyAdapter(this , words ,R.drawable.color_dusty_yellow);
        lv.setAdapter(arr);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mediaPlayer = MediaPlayer.create(Numbers.this , words.get(position).getAudioId());
                mediaPlayer.start();
            }
        });

    }

}



