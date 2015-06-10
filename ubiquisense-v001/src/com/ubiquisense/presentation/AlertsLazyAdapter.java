/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package com.ubiquisense.presentation;

import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ubiquisense.R;
import com.ubiquisense.utils.ImageLoader;
 
public class AlertsLazyAdapter extends BaseAdapter {
 
    private Activity activity;
    private Map<String, JSONObject> data;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader;
 
    public AlertsLazyAdapter(Activity a, Map<String, JSONObject> d) {
        activity 	= a;
        data		= d;
        inflater 	= (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader	= new ImageLoader(activity.getApplicationContext());
    }
 
    public int getCount() {
        return data.size();
    }
 
    public Object getItem(int position) {
        return position;
    }
 
    public long getItemId(int position) {
        return position;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_row, null);
 
        TextView title = (TextView)vi.findViewById(R.id.title); // title
        TextView artist = (TextView)vi.findViewById(R.id.artist); // artist name
//      TextView duration = (TextView)vi.findViewById(R.id.duration); // duration
//      ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); // thumb image
 
        JSONObject alert = new JSONObject();
        int idx = 0;
        for (String k : data.keySet()) {
        	if (idx == position) {
        		alert = data.get(k);
        		break;
        	}
        	idx++;
        }
 
		try {
			String uuid = alert.getString("uuid");
			String label	= alert.getString("label");
			
	        JSONArray rulesArray = alert.getJSONArray("rules");
	        
	        for (int i=0;i<rulesArray.length();i++) {
	        	JSONObject r = rulesArray.getJSONObject(i);
	        	try {
		        	String price	 	= r.getString("price");
		        	String compliance 	= r.getString("compliance");
		        	String currency 	= r.getString("currency");
		        	String tolerance	= r.getString("tolerance");
		        	String kind 		= r.getString("kind");
		        	
	        	} catch (JSONException ex) {
	        		Log.e("alerts-adapter", ex.toString());
	        	}
	        }
	        
	        
	        title.setText(uuid + " (" + label + ")");
	        
	        artist.setText(rulesArray.length() + " triggers");
	        
	        //duration.setText(song.get(CustomizedListView.KEY_DURATION));
	        //imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image);
		} catch (JSONException e) {
			e.printStackTrace();
		}
        return vi;
    }
}