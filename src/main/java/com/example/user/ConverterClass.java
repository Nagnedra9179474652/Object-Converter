package com.example.user;

import java.util.ArrayList;
import java.util.List;

import com.example.util.JsonUtil;

public class ConverterClass {

	public static void main(String[] args) {
		UserBean userRest = new UserBean();
		userRest.setName("Ravi");
		userRest.setId(1);
		List<String> list = new ArrayList<String>();
		list.add("MP");
		list.add("Sidhi");
		list.add("Hatwa");
		userRest.setMessage(list);
		
		System.out.println("=== Converting java to Json ==== ");
		String str = JsonUtil.convertJavaToJson(userRest);
		System.out.println("Converting java to Json " + str);

		System.out.println("==== Converting Json to Java ====");
		UserBean userBean = JsonUtil.convertJsonToJava(str, UserBean.class);
		System.out.println("User Id : "+userBean.getId()+"\nUser Name : "+userBean.getName()+"\nUser Message : "+userBean.getMessage());

	}

}
