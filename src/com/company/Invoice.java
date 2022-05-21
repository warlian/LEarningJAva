package com.company;

import java.util.Date;

public class Invoice {
    /*step 3 create the constructor alt+insert and select constructor*/
    public Invoice(String title, Date date, Double total) {
        this.title = title;
        this.date = date;
        this.total = total;
    }

    /*step 1 declaring private fields*/
    private String title;
    private Date date;
    private Double total;



    /*step 2 generate getter and setter alt+insert and select- generate- select all item and do click on getter and setter*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
/*4 create the to string alt+insert and select to string select all items  */

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
