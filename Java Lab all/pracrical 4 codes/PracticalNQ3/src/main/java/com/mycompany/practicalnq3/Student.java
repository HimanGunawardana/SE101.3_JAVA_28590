
package com.mycompany.practicalnq3;

public class Student extends Person
{
    private String course;
    
    public Student(int id,String name,String course)
    {
        super(id,name);
        this.course=course;
    }
    public String getCourse()
    {
        return course;
    }
}
