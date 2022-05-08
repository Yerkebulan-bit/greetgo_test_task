package com.greetgo.eschool.dao;

import com.greetgo.eschool.model.Student;
import com.greetgo.eschool.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentMapper {

    public List<Student> getAllStudents(){
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        List<Student> students =  session.selectList("getAllStudents");
        session.commit();
        session.close();
        return students;
    }

    public void insertStudent(Student student){
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        session.insert("insertStudent", student);
        session.commit();
        session.close();
    }

    public void deleteStudent(int studentId){
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        session.delete("deleteStudent", studentId);
        session.commit();
        session.close();
    }

    public void insertStudentWithId(Student student){
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        session.insert("insertStudentWithId", student);
        session.commit();
        session.close();
    }

    public Student getStudentById(int studentId){
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        Student student = session.selectOne("getStudentById", studentId);
        session.commit();
        session.close();
        return student;
    }
}
