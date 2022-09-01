package com.fourserve.dao;

import com.fourserve.dto.Student;

public interface StudentDao {
	public String add(Student student);
	public String search(String sid);
	public String update(Student student);
	public String delete(String sid);

}
