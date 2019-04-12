package ro.jademy.hr.model;

import java.util.Date;

public class Department {
    public static final String DEPARTMENT_TABLE_NAME = "departments";
    public static final String DEPARTMENT_DEPT_NO = "dept_no";
    public static final String DEPARTMENT_DEPT_TITLE = "dept_name";

    private String deptNo;
    private String deptTitle;
    private Date fromDate;
    private Date toDate;

    public Department(String deptNo, String deptTitle, Date fromDate, Date toDate) {
        this.deptNo = deptNo;
        this.deptTitle = deptTitle;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptTitle() {
        return deptTitle;
    }

    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
