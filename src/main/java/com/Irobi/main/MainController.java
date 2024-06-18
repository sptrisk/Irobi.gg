package com.Irobi.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Irobi.RiotAPI.RiotAPI;

@Controller
public class MainController {

	@Autowired 
	public RiotAPI RiotApi;
	
	
	public String main() {
		
	}
	
	
	
}
