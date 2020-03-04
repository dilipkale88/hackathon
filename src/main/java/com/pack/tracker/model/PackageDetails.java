package com.pack.tracker.model;

import java.util.List;

public class PackageDetails {

	String trackingNbr;
	List<ErrorCode> errorList;
	public String getTrackingNbr() {
		return trackingNbr;
	}
	public void setTrackingNbr(String trackingNbr) {
		this.trackingNbr = trackingNbr;
	}
	public List<ErrorCode> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<ErrorCode> errorList) {
		this.errorList = errorList;
	}
	
}
