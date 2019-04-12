package ro.jademy.hr.model;

import java.util.Date;

public class Title {

    public static final String TITLE_TABLE_NAME = "titles";
    public static final String TITLE_EMP_NO = "empNo";
    public static final String TITLE_TITLE = "title";
    public static final String TITLE_FROM_DATE = "from_date";
    public static final String TITLE_TO_DATE = "to_date";

    private String title;
    private Date fromDate;
    private Date toDate;

    public Title(String title) {
        this.title = title;
    }

    public Title(String title, Date fromDate, Date toDate) {
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
