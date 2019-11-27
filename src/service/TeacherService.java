package service;


import dao.TeacherDao;
import domain.Teacher;

import java.sql.SQLException;
import java.util.Set;

public final class TeacherService {
	private static TeacherDao teacherDao= TeacherDao.getInstance();
	private static TeacherService teacherService=new TeacherService();
	private TeacherService(){}
	
	public static TeacherService getInstance(){
		return teacherService;
	}
	
	public Set<Teacher> findAll() throws SQLException {
		return teacherDao.findAll();
	}
	
	public Teacher find(Integer id) throws SQLException {
		return teacherDao.find(id);
	}
	
	public boolean update(Teacher teacher) throws SQLException {
		return teacherDao.update(teacher);
	}
	
	public boolean add(Teacher teacher) throws SQLException {
		return teacherDao.add(teacher);
	}

	public boolean delete(Integer id) throws SQLException {
		return teacherDao.delete(id);
	}
	
	/*public boolean delete(Teacher teacher){
		//如果该教师有关联的课题，不能删除
		if(teacher.getProjects().size()>0){
			return false;
		}
		return teacherDao.delete(teacher);
	}	*/
}
