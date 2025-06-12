package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("teamd")
@Profile({"india","england","southafrica"})
public class TeamDAO {
	
	@Autowired
	private Team tm;
	
	public void TeamDetails() {
		System.out.println("Team ID\t\t\t:"+tm.getId());	
		System.out.println("Team Name\t\t:"+tm.getName());	
		System.out.println("Team Captain\t:"+tm.getCaptain());	
		System.out.println("Team Coach\t\t:"+tm.getCoach());	
		
		
	}

	
	
}
