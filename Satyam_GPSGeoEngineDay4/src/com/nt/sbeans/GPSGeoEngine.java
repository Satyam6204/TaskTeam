package com.nt.sbeans;

import java.util.ArrayList;
import java.util.List;

public class GPSGeoEngine implements IGeoEngine {

	@Override
	public List<String> direction(String source, String destination, String travelMode) {
	  List<String> con= new ArrayList<>();
	  con.add("33.45,39.6");
	  con.add("29.45,23.7");
	  con.add(source);
	  con.add(destination);
	  con.add(travelMode);
	  
	  return con;
	  
		
	}

}
