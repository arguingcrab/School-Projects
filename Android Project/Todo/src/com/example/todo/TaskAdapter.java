package com.example.todo;

import java.util.List;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TaskAdapter extends ArrayAdapter<Task> {
	private Context context;
    private List<Task> Tasks;
    
    public TaskAdapter(Context context, List<Task> objects) {
        super(context, R.layout.task_row_item, objects);
        this.context = context;
        this.Tasks = objects;
    }
    
    //show task items on a list view
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            LayoutInflater mLayoutInflater = LayoutInflater.from(context);
            convertView = mLayoutInflater.inflate(R.layout.task_row_item, null);
        }
        
        Task task = Tasks.get(position);
        
        //get and show description
        TextView descriptionView = (TextView) convertView.findViewById(R.id.task_description);        
        descriptionView.setText(task.getDescription());
        
        //if complete , show as strike text
        if(task.isCompleted()){
            descriptionView.setPaintFlags(descriptionView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }else{
            descriptionView.setPaintFlags(descriptionView.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
        }
        
        return convertView;
    }
}
