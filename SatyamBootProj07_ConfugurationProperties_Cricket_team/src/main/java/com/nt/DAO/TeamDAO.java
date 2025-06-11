package com.nt.DAO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("teamDao")
@PropertySource("application-india.properties")
public class TeamDAO {
	
	@Value("${team.ind.id}")
     private Long id;
	@Value("${team.ind.name}")
	private String name;
	@Value("${team.ind.captain}")
	private String captain;
	@Value("${team.ind.coach}")
	private String coach;
	
	public void AllTeam(){
	System.out.println("TeamID "+ id);
	 System.out.println("TeamName "+name);
	 System.out.println("TeamCaptain "+captain);
	 System.out.println("TeamCoach "+coach);
	}
	}


