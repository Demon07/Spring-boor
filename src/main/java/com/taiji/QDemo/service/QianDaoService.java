package com.taiji.QDemo.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class QianDaoService {

	public String qiandao(String name,List<String> namez,List<String> names) {
		boolean flag=false; 
		int i=0,j=0;
		if(names!=null) {
			for (String string : names) {
				if(name.equals(string)) {
					System.out.println("您已签到,无需重复签到!");
					flag=false;
				}else {
					j++;
				}
			}
			if(names.size()==j) {
				flag=true;
			}
		}
		while(flag) {
			for (String string : namez) {
				if(name.equals(string)) {
					System.out.println("签到成功");				
					return name;
				}else{
					i++;
					
				}
			}
			if(namez.size()==i) {
				System.out.println("您不是本班学生");
			}
			return null;
		}
		return null;
	}
}
