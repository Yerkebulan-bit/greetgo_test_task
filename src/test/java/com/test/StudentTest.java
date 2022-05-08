package com.test;


import com.greetgo.eschool.dao.StudentMapper;
import com.greetgo.eschool.model.Student;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

@Test
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-test-config.xml"})
public class StudentTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private StudentMapper studentMapper;

    @BeforeTest
    public void setup(){

    }

    @Test
    public void testInputStudent(){
        int id = 100;
        String testName = "TestName";
        String testGrade = "TestGrade";

        Student student = new Student();

        student.setId(id);
        student.setName(testName);
        student.setGrade(testGrade);
        studentMapper.insertStudentWithId(student);

        Student testStudent = studentMapper.getStudentById(id);
        studentMapper.deleteStudent(id);

        Assert.assertEquals(id, testStudent.getId());
        Assert.assertEquals(testName, testStudent.getName());
        Assert.assertEquals(testGrade, testStudent.getGrade());
    }
}
