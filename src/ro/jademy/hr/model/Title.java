package ro.jademy.hr.model;

import java.util.Date;

public class Title {

    public static final String TITLE_TABLE_NAME = "titles";
    public static final String TITLE_EMP_NO = "empNo";
    public static final String TITLE_TITLE = "title";
    public static final String TITLE_FROM_DATE = "from_date";
    public static final String TITLE_TO_DATE = "to_date";

    public String empNo;
    public String Title;
    public Date fromDate;
    public Date toDate;

    public Title(String empNo, String title, Date fromDate, Date toDate) {
        this.empNo = empNo;
        Title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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
