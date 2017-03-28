package com.ashu.springdemo.service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MapImpl {	
	
	
	@Autowired
	HashMap CONFIG_MAP;
	
	public void readMap(){
		
		System.out.println(CONFIG_MAP.get("test"));	
			
		}
}