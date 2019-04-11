package ro.jademy.hr.model;

public class Department {
    public static final String DEPARTMENT_TABLE_NAME = "departments";
    public static final String DEPARTMENT_DEPT_NO = "dept_no";
    public static final String DEPARTMENT_DEPT_TITLE = "dept_name";

    private String deptNo;
    private String deptTitle;

    public Department(String deptNo, String deptTitle) {
        this.deptNo = deptNo;
        this.deptTitle = deptTitle;
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
}
