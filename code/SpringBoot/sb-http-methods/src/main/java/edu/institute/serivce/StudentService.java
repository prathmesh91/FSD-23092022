package edu.institute.serivce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import edu.institute.bean.Student;

@Service
public class StudentService {

	
	private ArrayList<Student> list = new ArrayList<Student>();
	
	public void addStudent(Student stud) {
		list.add(stud);
	}
	
	public List<Student> getAllStudent() {
		return list;
	}
	
	public boolean deleteStudent(int id) {
		boolean flag = false;
		Student deleteSt = null;
		for(Student st : list) {
			if(st.getId() == id) {
				deleteSt = st;
			}
		}
		flag = list.remove(deleteSt);
		return flag;
	}
	
	public boolean updateStudent(Student st) {
		boolean flag = false;
		
		int index = -1;
		for(int i = 0; i<list.size(); i++) {
			if(st.getId() == list.get(i).getId()) {
				index = i;
			}
		}
		if(index>=0) {
			list.set(index, st);
			flag=true;
		}
		
		return flag;
	}
	
	
	
}















