package com.nt.sbeans;

import java.util.List;

public class MapRender {
	
	private IGeoEngine geoEngine;

	public MapRender() {
	  System.out.println("I'm MapRender constructor non param comstustor");
	}
	
	public MapRender(IGeoEngine geoEngine) {
		 System.out.println("I'm MapRender constructor param comstustor");
		this.geoEngine = geoEngine;
		System.out.println("MapReader.MapRender()");
	}
	
	public void setMapRender(IGeoEngine geoEngine) {
		 System.out.println("I'm MapRender setter method param comstustor");
		this.geoEngine=geoEngine;
	}
	
	public void reader(String source,String distnation,String travelMode) {
		List<String> result=geoEngine.direction(source, distnation, travelMode);
		System.out.println("Rendering directions");
		for(String point: result) {
			System.out.println(point);
		}	
	}
}
