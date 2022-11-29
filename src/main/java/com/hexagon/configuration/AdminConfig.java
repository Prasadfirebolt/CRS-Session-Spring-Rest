package com.hexagon.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.hexagon.service.Admin;
import com.hexagon.service.AdminImpl;

@Configurable
public class AdminConfig {
	@Bean(name="adminBean")
	public Admin admin() {
		return new AdminImpl();
	}


}
