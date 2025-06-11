/*
 * Assignment: Spring Boot Task on Bulk Injection using Properties File
=====================================================================
Objective:
Develop a Spring Boot application to store and display cricket team information by performing bulk injection using profile-specific properties files.

Task Description:
1. Domain Layer (Entity Class - Team):

Design a class named Team to represent a cricket team with the following attributes:

Team ID (long)

Team Name (String)

Team Captain (String)

Team Coach (String)

The class should have appropriate getter and setter methods.

2. DAO Layer (Data Access Layer):
Create a class named TeamDao with the following requirement:

A method to save the Team object.

This method should simulate saving the team details (for example, printing the team details on the console).

3. Properties Files (Profile-Specific Configuration):

Create four separate profile-specific properties files under the resources folder:

application-india.properties

application-australia.properties

application-england.properties

application-southafrica.properties

Each properties file must contain the following team details:

Team ID

Team Name

Team Captain

Team Coach


Fill these files with appropriate and realistic data for each country’s cricket team.

4. Configuration Layer:

Configure Spring Boot to:

Automatically detect and load beans.

Load profile-specific properties based on the active profile.

Ensure the properties are properly injected into the Team class.

5. Main Application:

The main class should:

Activate the appropriate Spring Profile.

Read team details from the corresponding properties file.

Create the Team object using the injected values.

Call the save method of TeamDao to display the team details.


Expected Output Example (if 'india' profile is active):
Saving Team Details:
Team ID: 1
Team Name: India
Team Captain: Rohit Sharma
Team Coach: Rahul Dravid

 * */

package com.nt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.DAO.TeamDAO;

@SpringBootApplication
public class SatyamBootProj07ConfugurationPropertiesCricketTeamApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SatyamBootProj07ConfugurationPropertiesCricketTeamApplication.class, args);
		
		TeamDAO td=ctx.getBean("teamDao",TeamDAO.class);
		
		td.AllTeam();
		
		((ConfigurableApplicationContext) ctx).close();
		
		
	}

}
