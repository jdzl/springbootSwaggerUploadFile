package com.jdzl.models;

public class User {

    private String name;
    private String cc;
    private String email;
    private String report_url;
    private boolean sentToEmail=false;

    public User(String name, String cc, String email, String report_url) {
        this.name = name;
        this.cc = cc;
        this.email = email;
        this.report_url = report_url;
    }

    public User(String name, String cc, String email, String report_url, boolean sentToEmail) {
        this.name = name;
        this.cc = cc;
        this.email = email;
        this.report_url = report_url;
        this.sentToEmail = sentToEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReport_url() {
        return report_url;
    }

    public void setReport_url(String report_url) {
        this.report_url = report_url;
    }

    public boolean isSentToEmail() {
        return sentToEmail;
    }

    public void setSentToEmail(boolean sentToEmail) {
        this.sentToEmail = sentToEmail;
    }
}
