package ro.jademy.hr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

    public static final String EMP_TABLE_NAME = "employees";
    public static final String EMP_EMP_NO = "empNo";
    public static final String EMP_BIRTH_DATE = "birthDate";
    public static final String EMP_FIRST_NAME = "firstName";
    public static final String EMP_LAST_NAME = "lastName";
    public static final String EMP_GENDER = "gender";
    public static final String EMP_HIRE_DATE = "hireDate";


    private String empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private Date hireDate;
    private List<Integer> salaries = new ArrayList<>();

    public Employee(String empNo, Date birth_date, String firstName, String lastName, String gender, Date hireDate) {
        this.empNo = empNo;
        this.birthDate = birth_date;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }



    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public List<Integer> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Integer> salaries) {
        this.salaries = salaries;
    }
}
