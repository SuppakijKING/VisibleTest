package king.suppakij.visibletest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by WARANYAPON on 9/2/15.
 */
public class AdapterListview extends BaseAdapter {

    private Context objContext;
    private int[] indexInts;
    private String[] indexStrings;

    public AdapterListview(Context objContext, int[] indexInts, String[] indexStrings) {
        this.objContext = objContext;
        this.indexInts = indexInts;
        this.indexStrings = indexStrings;
    }// Constructor

    @Override
    public int getCount() {
        return indexStrings.length ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.index_listview, parent, false);

        //show icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.icon_index);
        iconImageView.setBackgroundResource(indexInts[position]);

        //show title
        TextView titleTextView = (TextView) view1.findViewById(R.id.txt_listview);
        titleTextView.setText(indexStrings[position]);

        return view1;
    }
} // main class
