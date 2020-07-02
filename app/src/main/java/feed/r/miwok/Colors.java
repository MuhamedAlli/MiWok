package feed.r.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Colors extends AppCompatActivity {
    ArrayList<Word> colors = new ArrayList<Word>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        lv = (ListView)findViewById(R.id.lvcolors);
        colors.add(new Word("red","weṭeṭṭi", R.drawable.color_red  , R.raw.color_red));
        colors.add(new Word("Green" , "chokokki",R.drawable.color_green , R.raw.color_green));
        colors.add(new Word("Brown" , "ṭakaakki",R.drawable.color_brown , R.raw.color_brown ));
        colors.add(new Word("Gray" , "ṭopoppi", R.drawable.color_gray  , R.raw.color_gray));
        colors.add(new Word("Black" , "kululli",R.drawable.color_black  , R.raw.color_black));
        colors.add(new Word("White" , "kelelli", R.drawable.color_white , R.raw.color_white));
        colors.add(new Word("Dusty Yellow" , "ṭopiisә", R.drawable.color_dusty_yellow , R.raw.color_dusty_yellow));
        colors.add(new Word("Mustard Yellow" , "chiwiiṭә", R.drawable.color_mustard_yellow , R.raw.color_mustard_yellow));
        MyAdapter arr = new MyAdapter(this , colors ,R.drawable.color_mustard_yellow);
        lv.setAdapter(arr);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mediaPlayer = MediaPlayer.create(Colors.this , colors.get(position).getAudioId());
                mediaPlayer.start();
            }
        });

    }
}
