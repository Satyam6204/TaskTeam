package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="team")
public class Team {
	
	private Long id;
	
	private String name;
	
	private String captain;
	
	private String coach;

}
