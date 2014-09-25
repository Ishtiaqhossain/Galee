package com.galee.ui;

import java.util.Collection;
import java.util.List;

import com.galee.model.Gali;
import com.gukha.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GaliListAdapter extends ArrayAdapter<Gali> {
	
	private final Context context;
	private final List<Gali> values;

	public GaliListAdapter(Context context, List<Gali> objects) {
		super(context, 0, objects);
		this.context = context;
		this.values = objects;
	}
	
	@Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.gali_row, parent, false);
	    TextView galiNameTextView = (TextView) rowView.findViewById(R.id.galiName);
	    TextView sentCountTextView = (TextView) rowView.findViewById(R.id.sentCount);
	    galiNameTextView.setText(values.get(position).name);
	    sentCountTextView.setText(String.valueOf(values.get(position).sentCount));
	    return rowView;
	  }
}
