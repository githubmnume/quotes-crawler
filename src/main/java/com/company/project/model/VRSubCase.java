package com.company.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VRSubCase {
	/**
	 * Test Case id - Test Case Heading/Description
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseid;// 菜单主键，GenerationType.IDENTITY即是主键生成模式，自增长。

	
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
}
