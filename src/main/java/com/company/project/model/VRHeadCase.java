package com.company.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="author")
public class VRHeadCase {
	  /**
     * VR case identify
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//菜单主键，GenerationType.IDENTITY即是主键生成模式，自增长。

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
    @Column(name="title")
    private String title;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "caseid")    //根据父级菜单ID，实现自关联（内部其实也就是一对多）
    private List<VRSubCase> subCases;

	public Integer getCaseid() {
		return id;
	}

	public void setCaseid(Integer caseid) {
		this.id = caseid;
	}

	public String getFunctionarea() {
		return functionarea;
	}

	public void setFunctionarea(String functionarea) {
		this.functionarea = functionarea;
	}

	public String getVstcnr() {
		return vstcnr;
	}

	public void setVstcnr(String vstcnr) {
		this.vstcnr = vstcnr;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<VRSubCase> getSubCases() {
		return subCases;
	}

	public void setSubCases(List<VRSubCase> subCases) {
		this.subCases = subCases;
	}

	@Override
	public String toString() {
		return String.format("VRHeadCase [caseid=%s, functionarea=%s, vstcnr=%s, title=%s, subCases=%s]", id,
				functionarea, vstcnr, title, subCases);
	}
}
