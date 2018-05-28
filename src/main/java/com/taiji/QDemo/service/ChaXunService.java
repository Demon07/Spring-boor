package com.taiji.QDemo.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ChaXunService {
	
	public String chaxun(String name,List<String> nameq,List<String> namez) {
		boolean flag=false;
		int i=0,j=0;
		for (String string : namez) {
			if(!name.equals(string)) {
				j++;
			}
		}
		if(namez.size()==j) {
			System.out.println(name+"不是本班同学");
			flag=false;
		}else {
			flag=true;
		}
		while(flag) {
			for (String string : nameq) {
				if(name.equals(string)) {
					System.out.println(name+"已签到");
					break;
				}else {
					i++;
					
				}
			}
			if(nameq.size()==i) {
				System.out.println(name+"未签到");
			}
			return name;
		}
		return null;
		
		
		
	}
}
