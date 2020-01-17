package com.mysprhib.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysprhib.demo.dao.StudentStaffSearchDao;
import com.mysprhib.demo.model.StaffInfo;
import com.mysprhib.demo.model.StudentMarkHigher;
import com.mysprhib.demo.model.StudentMarkPrimary;
import com.mysprhib.demo.model.StudentMarkSecondary;

@Controller
public class MyController {

	
	@RequestMapping("/")
	public String home()
	{
		return "choose";
	}
		
	@Autowired
	StudentStaffSearchDao dao;
	
	


	@RequestMapping("display")
	public String display(@RequestParam("opt") String opt)
	{
		if(opt.equalsIgnoreCase("staff"))
		{
		return "searchStaff";
		}
		if(opt.equalsIgnoreCase("student"))
		{
		return "searchStudent";
		}
		return "";
		
	}

	
	
	
	@RequestMapping("searchStaff")
	public String display(Model model,@RequestParam("exp") String exp,@RequestParam("qul") String qul,@RequestParam("salary") String salary,@RequestParam("designation") String designation)
	{
		
		System.out.println(exp);
		System.out.println(salary);
		System.out.println(designation);
		System.out.println(qul);
		
		ArrayList<StaffInfo> staffList= dao.getStaffInfo(designation,Integer.parseInt(salary),Integer.parseInt(exp),qul);
		
		model.addAttribute("staffList", staffList);
		return "displayStaff";
	}

	
	@RequestMapping("getdata")
	public String getDataStudent(Model model,@RequestParam("std") String std)
	{
		if(std.equals("primary"))
		{
			ArrayList<Object> studentData= dao.getStudentMarks(std);
			ArrayList<StudentMarkPrimary> studList=new ArrayList<StudentMarkPrimary>();

			for(Object obj:studentData)
			{
				StudentMarkPrimary stud=(StudentMarkPrimary)obj;
				studList.add(stud);
			}

			model.addAttribute("studentData",studList);
						return "displayStudentPrimary";			
		}
		
		if(std.equals("secondary"))
		{
			ArrayList<Object> studentData= dao.getStudentMarks(std);
			ArrayList<StudentMarkSecondary> studList=new ArrayList<StudentMarkSecondary>();

			for(Object obj:studentData)
			{
				StudentMarkSecondary stud=(StudentMarkSecondary)obj;
				studList.add(stud);
			}
			model.addAttribute("studentData",studList);
			return "displayStudentSecondary";			
		}
				
		if(std.equals("higher"))
		{ArrayList<Object> studentData= dao.getStudentMarks(std);
		ArrayList<StudentMarkHigher> studList=new ArrayList<StudentMarkHigher>();

		for(Object obj:studentData)
		{
			StudentMarkHigher stud=(StudentMarkHigher)obj;
			studList.add(stud);
		}

		model.addAttribute("studentData",studList);
					return "displayStudentHigher";
		}
		return "";
	}
	
}
