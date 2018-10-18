package com.company.project.model;

import javax.persistence.*;

public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String url;

	private String img;

	private String info;

	private String year;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return img
	 */
	public String getImg() {
		return img;
	}

	/**
	 * @param img
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * @return info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * @return year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year
	 */
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return String.format("Film [name=%s, url=%s, img=%s, info=%s, year=%s]", name, url, img, info, year);
	}

}