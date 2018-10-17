package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Vrlist {
    /**
     * VR case identify
     */
    @Id
    private Integer caseid;

    /**
     * Function Area
     */
    @Column(name = "functionArea")
    private String functionarea;

    /**
     * VS/TC Nr
     */
    @Column(name = "vstcNr")
    private String vstcnr;

    /**
     * Title/TC Headline/Bug
     */
    private String title;

    /**
     * Test Case id - Test Case Heading/Description
     */
    @Column(name = "caseDescription")
    private String casedescription;

    /**
     * Priority
     */
    private String priority;

    /**
     * who is the tester
     */
    private String tester;

    /**
     * Help Anchor
     */
    @Column(name = "helpAhcr")
    private String helpahcr;

    /**
     * Tooltips
     */
    private String tooltips;

    /**
     * Address label
     */
    private String addrslabel;

    /**
     * test Result
     */
    private String result;

    /**
     * Java version
     */
    private String java;

    /**
     * os version
     */
    private String os;

    /**
     * AMM/Node type
     */
    private String nodetype;

    /**
     * NPU type
     */
    private String npu;

    /**
     * IP Std.
     */
    private String ipstd;

    /**
     * T.Std.
     */
    private String tstd;

    /**
     * Product
     */
    private String product;

    /**
     * SBL
     */
    private String sbl;

    /**
     * ML Craft
     */
    private String mlcraft;

    /**
     * test date
     */
    private Date testdate;

    /**
     * Bug / Issue number
     */
    @Column(name = "bugissueNo")
    private String bugissueno;

    /**
     * Comments
     */
    private String comments;

    /**
     * VR Reviewer
     */
    @Column(name = "vrReviewer")
    private String vrreviewer;

    /**
     * Week
     */
    private String week;

    /**
     * Yoshi,Pikachu,Mario
     */
    private String team;

    /**
     * 获取VR case identify
     *
     * @return caseid - VR case identify
     */
    public Integer getCaseid() {
        return caseid;
    }

    /**
     * 设置VR case identify
     *
     * @param caseid VR case identify
     */
    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    /**
     * 获取Function Area
     *
     * @return functionArea - Function Area
     */
    public String getFunctionarea() {
        return functionarea;
    }

    /**
     * 设置Function Area
     *
     * @param functionarea Function Area
     */
    public void setFunctionarea(String functionarea) {
        this.functionarea = functionarea;
    }

    /**
     * 获取VS/TC Nr
     *
     * @return vstcNr - VS/TC Nr
     */
    public String getVstcnr() {
        return vstcnr;
    }

    /**
     * 设置VS/TC Nr
     *
     * @param vstcnr VS/TC Nr
     */
    public void setVstcnr(String vstcnr) {
        this.vstcnr = vstcnr;
    }

    /**
     * 获取Title/TC Headline/Bug
     *
     * @return title - Title/TC Headline/Bug
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置Title/TC Headline/Bug
     *
     * @param title Title/TC Headline/Bug
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取Test Case id - Test Case Heading/Description
     *
     * @return caseDescription - Test Case id - Test Case Heading/Description
     */
    public String getCasedescription() {
        return casedescription;
    }

    /**
     * 设置Test Case id - Test Case Heading/Description
     *
     * @param casedescription Test Case id - Test Case Heading/Description
     */
    public void setCasedescription(String casedescription) {
        this.casedescription = casedescription;
    }

    /**
     * 获取Priority
     *
     * @return priority - Priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 设置Priority
     *
     * @param priority Priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * 获取who is the tester
     *
     * @return tester - who is the tester
     */
    public String getTester() {
        return tester;
    }

    /**
     * 设置who is the tester
     *
     * @param tester who is the tester
     */
    public void setTester(String tester) {
        this.tester = tester;
    }

    /**
     * 获取Help Anchor
     *
     * @return helpAhcr - Help Anchor
     */
    public String getHelpahcr() {
        return helpahcr;
    }

    /**
     * 设置Help Anchor
     *
     * @param helpahcr Help Anchor
     */
    public void setHelpahcr(String helpahcr) {
        this.helpahcr = helpahcr;
    }

    /**
     * 获取Tooltips
     *
     * @return tooltips - Tooltips
     */
    public String getTooltips() {
        return tooltips;
    }

    /**
     * 设置Tooltips
     *
     * @param tooltips Tooltips
     */
    public void setTooltips(String tooltips) {
        this.tooltips = tooltips;
    }

    /**
     * 获取Address label
     *
     * @return addrslabel - Address label
     */
    public String getAddrslabel() {
        return addrslabel;
    }

    /**
     * 设置Address label
     *
     * @param addrslabel Address label
     */
    public void setAddrslabel(String addrslabel) {
        this.addrslabel = addrslabel;
    }

    /**
     * 获取test Result
     *
     * @return result - test Result
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置test Result
     *
     * @param result test Result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取Java version
     *
     * @return java - Java version
     */
    public String getJava() {
        return java;
    }

    /**
     * 设置Java version
     *
     * @param java Java version
     */
    public void setJava(String java) {
        this.java = java;
    }

    /**
     * 获取os version
     *
     * @return os - os version
     */
    public String getOs() {
        return os;
    }

    /**
     * 设置os version
     *
     * @param os os version
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * 获取AMM/Node type
     *
     * @return nodetype - AMM/Node type
     */
    public String getNodetype() {
        return nodetype;
    }

    /**
     * 设置AMM/Node type
     *
     * @param nodetype AMM/Node type
     */
    public void setNodetype(String nodetype) {
        this.nodetype = nodetype;
    }

    /**
     * 获取NPU type
     *
     * @return npu - NPU type
     */
    public String getNpu() {
        return npu;
    }

    /**
     * 设置NPU type
     *
     * @param npu NPU type
     */
    public void setNpu(String npu) {
        this.npu = npu;
    }

    /**
     * 获取IP Std.
     *
     * @return ipstd - IP Std.
     */
    public String getIpstd() {
        return ipstd;
    }

    /**
     * 设置IP Std.
     *
     * @param ipstd IP Std.
     */
    public void setIpstd(String ipstd) {
        this.ipstd = ipstd;
    }

    /**
     * 获取T.Std.
     *
     * @return tstd - T.Std.
     */
    public String getTstd() {
        return tstd;
    }

    /**
     * 设置T.Std.
     *
     * @param tstd T.Std.
     */
    public void setTstd(String tstd) {
        this.tstd = tstd;
    }

    /**
     * 获取Product
     *
     * @return product - Product
     */
    public String getProduct() {
        return product;
    }

    /**
     * 设置Product
     *
     * @param product Product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * 获取SBL
     *
     * @return sbl - SBL
     */
    public String getSbl() {
        return sbl;
    }

    /**
     * 设置SBL
     *
     * @param sbl SBL
     */
    public void setSbl(String sbl) {
        this.sbl = sbl;
    }

    /**
     * 获取ML Craft
     *
     * @return mlcraft - ML Craft
     */
    public String getMlcraft() {
        return mlcraft;
    }

    /**
     * 设置ML Craft
     *
     * @param mlcraft ML Craft
     */
    public void setMlcraft(String mlcraft) {
        this.mlcraft = mlcraft;
    }

    /**
     * 获取test date
     *
     * @return testdate - test date
     */
    public Date getTestdate() {
        return testdate;
    }

    /**
     * 设置test date
     *
     * @param testdate test date
     */
    public void setTestdate(Date testdate) {
        this.testdate = testdate;
    }

    /**
     * 获取Bug / Issue number
     *
     * @return bugissueNo - Bug / Issue number
     */
    public String getBugissueno() {
        return bugissueno;
    }

    /**
     * 设置Bug / Issue number
     *
     * @param bugissueno Bug / Issue number
     */
    public void setBugissueno(String bugissueno) {
        this.bugissueno = bugissueno;
    }

    /**
     * 获取Comments
     *
     * @return comments - Comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置Comments
     *
     * @param comments Comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 获取VR Reviewer
     *
     * @return vrReviewer - VR Reviewer
     */
    public String getVrreviewer() {
        return vrreviewer;
    }

    /**
     * 设置VR Reviewer
     *
     * @param vrreviewer VR Reviewer
     */
    public void setVrreviewer(String vrreviewer) {
        this.vrreviewer = vrreviewer;
    }

    /**
     * 获取Week
     *
     * @return week - Week
     */
    public String getWeek() {
        return week;
    }

    /**
     * 设置Week
     *
     * @param week Week
     */
    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * 获取Yoshi,Pikachu,Mario
     *
     * @return team - Yoshi,Pikachu,Mario
     */
    public String getTeam() {
        return team;
    }

    /**
     * 设置Yoshi,Pikachu,Mario
     *
     * @param team Yoshi,Pikachu,Mario
     */
    public void setTeam(String team) {
        this.team = team;
    }
}