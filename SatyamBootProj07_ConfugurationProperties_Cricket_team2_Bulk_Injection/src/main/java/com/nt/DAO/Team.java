package com.nt.DAO;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("Allteam")
@ConfigurationProperties(prefix="team.ind")
public class Team {
	
     private Long id;

	private String name;
	
	private String captain;
	
	private String coach;
	
	
	}


