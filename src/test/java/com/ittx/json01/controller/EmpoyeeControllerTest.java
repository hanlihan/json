package com.ittx.json01.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.ittx.json01.Department;
import com.ittx.json01.Employee;
import com.ittx.json01.FileUtil;

public class EmpoyeeControllerTest {

	@Test
	public void test() {
		List<Employee> lists = new ArrayList<Employee>();
		
		
		Employee employeeliste = new Employee();		
		employeeliste.setId(1);
		employeeliste.setName("张三");
		employeeliste.setSalary("2600");
		employeeliste.setAge(23);
		
		Employee employeeliste2 = new Employee();
		employeeliste2.setId(2);
		employeeliste2.setName("李四");
		employeeliste2.setSalary("3200");
		employeeliste2.setAge(32);
		
		lists.add(employeeliste);
		lists.add(employeeliste2);
		
		Department department = new Department();
		department.setCode(100);
		department.setDescription("请求成功");
		department.setLists(lists);
		
		Gson gson = new Gson();
		String json = gson.toJson(lists);
		System.out.println(json);
	}
     @Test
     public void  Tests(){
    	 String filedir = "E:\\Maven\\json001\\src\\main\\resources\\json1.json";
    	 String json = FileUtil.inputstreamToString(filedir);
 		  System.out.println(json);
 		
 		Gson gson = new Gson(); //jackson  fastjson gson
 		Department lists = gson.fromJson(json,Department.class);
 		System.out.println(lists.getDescription());
     }
}
