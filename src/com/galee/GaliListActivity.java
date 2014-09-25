package com.galee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.parse.ParseUser;
import com.galee.model.Gali;
import com.galee.provider.FakeGaliProvider;
import com.galee.provider.GaliProvider;
import com.galee.ui.GaliListAdapter;
import com.gukha.R;

/**
 * Shows the list of Galis. Make this a fragment and move to a tab/pager design.
 */
public class GaliListActivity extends Activity {

	@Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.gali_list);
    ListView lv = (ListView) findViewById(R.id.listView);
    GaliProvider galiProvider = new FakeGaliProvider();
    ListAdapter simpleAdpt = new GaliListAdapter(
    		this,
    		galiProvider.getGalis()
    );
    lv.setAdapter(simpleAdpt);
  }

  @Override
  protected void onStart() {
    super.onStart();
  }
}
