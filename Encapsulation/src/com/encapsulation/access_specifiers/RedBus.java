package com.encapsulation.access_specifiers;

public class RedBus {
	private String founder;
	private int year;
	private String country;
	private String size;
	private String publishedBy;
	private String catogory;
	private boolean accessLocation;
	private String lang;
	private String version;
	private String ratings;
	private double average;
	private String usersInteract;
	private boolean free;
	private String basicNeed;

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

///////////////////////////////////
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

///////////////////////////////////
	public String getCountry() {
		return country;
	}

	public void setCountry(String countryName) {
		this.country = countryName;
	}

///////////////////////////////////
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPublishedBy() {
		return publishedBy;
	}

	public void setPublishedBy(String publishedBy) {
		this.publishedBy = publishedBy;
	}

	public String getcatogory() {
		return catogory;
	}

	public void setcatogory(String catogory) {
		this.catogory = catogory;
	}

	public boolean isAccessLocation() {
		return accessLocation;
	}

	public void setAccessLocation(boolean accessLocation) {
		this.accessLocation = accessLocation;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getUsersInteract() {
		return usersInteract;
	}

	public void setUsersInteract(String usersInteract) {
		this.usersInteract = usersInteract;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getBasicNeed() {
		return basicNeed;
	}

	public void setBasicNeed(String basicNeed) {
		this.basicNeed = basicNeed;
	}

}
