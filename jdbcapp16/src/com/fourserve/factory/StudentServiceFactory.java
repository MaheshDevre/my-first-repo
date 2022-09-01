package com.fourserve.factory;

import com.fourserve.service.StudentService;
import com.fourserve.service.StudentServiceImpl;

public class StudentServiceFactory {
	private static StudentService studentService=null;
	static {
		studentService=new StudentServiceImpl();
	}
	public static StudentService getStudentService()
	{
		return studentService;
	}

}
