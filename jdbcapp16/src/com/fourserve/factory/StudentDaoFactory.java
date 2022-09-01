package com.fourserve.factory;

import com.fourserve.dao.StudentDao;
import com.fourserve.dao.StudentDaoImpl;

public class StudentDaoFactory {
	private static StudentDao studentDao = null;
	static
	{
		studentDao=new StudentDaoImpl();
	}
	public static StudentDao getStudentDao()
	{
		return studentDao;
	}

}
