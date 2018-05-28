package com.taiji.QDemo.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TongJiService {
	public int tongji(List<String> listz,List<String> listq){
		System.out.println("已签到人数："+listq.size());
		System.out.println("未签到人数："+(listz.size()-listq.size()));
		System.out.println("总人数："+listz.size());
		return listz.size()-listq.size();
		
	}
}
