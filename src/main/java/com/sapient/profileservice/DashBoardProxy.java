package com.sapient.profileservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "dashboard-service",fallback = DashBoardFallback.class)
public interface DashBoardProxy {

	@GetMapping("/dashboard")
	public String getDashboard();
	
}


@Controller
class DashBoardFallback implements DashBoardProxy{

	@Override
	public String getDashboard() {
		// TODO Auto-generated method stub
		return "DashBoard Service is Down";
	}
	
}
