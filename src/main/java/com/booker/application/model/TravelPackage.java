package com.booker.application.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TravelPackage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer travelPackageId;
	private String packageName;
	@OneToMany
	List<Service> availableServiceList;
	@OneToMany
	List<Image> images;
	private String description;
	
	public Integer getTravelPackageId() {
		return travelPackageId;
	}
	public void setTravelPackageId(Integer travelPackageId) {
		this.travelPackageId = travelPackageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public List<Service> getAvailableServiceList() {
		return availableServiceList;
	}
	public void setAvailableServiceList(List<Service> availableServiceList) {
		this.availableServiceList = availableServiceList;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
