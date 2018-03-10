package com.when.threemb.interactionforum;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by User on 7/30/2017.
 */

public class AnswerAdapter extends ArrayAdapter<Answer> {

    Context context;
    int size;

    public AnswerAdapter(Context context, int resource, List<Answer> objects) {
        super(context, resource, objects);
        this.context=context;
        size=objects.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.innerlv_list_item, parent, false);
        }

        TextView question,name,time;
        question=(TextView)convertView.findViewById(R.id.question);
        name=(TextView)convertView.findViewById(R.id.name);
        time=(TextView)convertView.findViewById(R.id.time);

        Answer ans=getItem(position);
        question.setText(ans.getMessage());
        name.setText(ans.getName());
        time.setText(ans.getTime());
        //Toast.makeText(context,""+size, Toast.LENGTH_SHORT).show();
        return convertView;
    }
}