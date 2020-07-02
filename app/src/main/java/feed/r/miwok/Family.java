package feed.r.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Family extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ListView lv = (ListView)findViewById(R.id.lvfamily);
        final ArrayList<Word> member = new ArrayList<Word>();
        member.add(new Word("Father" , "әpә" , R.drawable.family_father , R.raw.family_father));
        member.add(new Word("Mother" , "әṭa" , R.drawable.family_mother , R.raw.family_mother));
        member.add(new Word("Son" , "angsi" , R.drawable.family_son , R.raw.family_son));
        member.add(new Word("Doughter" , "tune" , R.drawable.family_daughter , R.raw.family_daughter));
        member.add(new Word("OLd Brother" , "taachi" , R.drawable.family_older_brother , R.raw.family_older_brother));
        member.add(new Word("Younger Brother" , "chalitti" , R.drawable.family_younger_brother , R.raw.family_younger_brother));
        member.add(new Word("Older Sister" , "tete" , R.drawable.family_older_sister , R.raw.family_older_sister));
        member.add(new Word("Younger Sister" , "kolliti" , R.drawable.family_younger_sister , R.raw.family_younger_sister));
        member.add(new Word("Grand Father" , "Paapa" , R.drawable.family_grandfather , R.raw.family_grandfather));
        member.add(new Word("Grang Mother" , "ama" , R.drawable.family_grandmother , R.raw.family_grandmother));

        MyAdapter arr= new MyAdapter(this , member , R.drawable.color_green);
        lv.setAdapter(arr);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mediaPlayer = MediaPlayer.create(Family.this , member.get(position).getAudioId());
                mediaPlayer.start();
            }
        });


    }
}
