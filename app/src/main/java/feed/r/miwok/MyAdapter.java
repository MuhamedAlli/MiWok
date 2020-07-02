package feed.r.miwok;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Word>{
    private int mcolorId;
    public MyAdapter(Context context, ArrayList<Word> objects , int colorId) {
        super(context,0, objects);
        mcolorId = colorId;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View vv = convertView;
        if(vv ==null) {
            vv = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false) ;
        }
        Word currentWord = getItem(position);
        TextView tv1 = vv.findViewById(R.id.engtrans);
        tv1.setText(currentWord.getMiwokTrans());
        TextView tv2 = vv.findViewById(R.id.miwoktrans);
        tv2.setText(currentWord.getEngTrans());
        Word current= getItem(position);
        ImageView imageView = vv.findViewById(R.id.img);

        View textContianer = (View)vv.findViewById(R.id.text_cont);

        if(current .is_image_here())
        {
            imageView.setImageResource(currentWord.getImageId());
            imageView.setVisibility(View.VISIBLE);
            textContianer.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            textContianer.setBackgroundColor(Color.GRAY);

            imageView.setVisibility(View.GONE);
        }


        return vv;
    }
}
