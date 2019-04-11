package ro.jademy.hr.model;

import java.util.Date;

public class Salary {
    public static final String SALARY_TABLE_NAME = "salaries";
    public static final String SALARY_EMP_NO = "empNo";
    public static final String SALARY_FROM_DATE = "from_date";
    public static final String SALARY_TO_DATE = "to_date";

    String empNo;
    int salary;
    Date fromDate;
    Date toDate;

    public Salary(String emp_no, int salary, Date from_date, Date to_date) {
        this.empNo = emp_no;
        this.salary = salary;
        this.fromDate = from_date;
        this.toDate = to_date;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date from_date) {
        this.fromDate = from_date;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date to_date) {
        this.toDate = to_date;
    }
}
