package com.ashu.springdemo.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
public class TestConfig {

@Bean(name="CONFIG_MAP")
public HashMap getMapData() {
	HashMap<String, String> CONFIG_MAP=null;
	FileInputStream file1 = null;
	Properties prop;
    try {
        prop = new Properties();
        InputStream in;
        file1 = new FileInputStream("Config.properties");
        prop.load(file1);
        CONFIG_MAP = new HashMap(prop);
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (file1 != null) {
            try {
                file1.close();
            } catch (Exception e) {
               
                e.printStackTrace();
            }
        }
    }	
	return CONFIG_MAP;
}	



}
