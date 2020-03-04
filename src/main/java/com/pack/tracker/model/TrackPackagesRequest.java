package com.pack.tracker.model;

import java.util.List;

public class TrackPackagesRequest {
	String appType;
	String appDeviceType;
	boolean supportHTML;
	boolean supportCurrentLocation;
	String uniqueKey;
	List<TrackNumberInfo> trackingInfoList;
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	public String getAppDeviceType() {
		return appDeviceType;
	}
	public void setAppDeviceType(String appDeviceType) {
		this.appDeviceType = appDeviceType;
	}
	public boolean isSupportHTML() {
		return supportHTML;
	}
	public void setSupportHTML(boolean supportHTML) {
		this.supportHTML = supportHTML;
	}
	public boolean isSupportCurrentLocation() {
		return supportCurrentLocation;
	}
	public void setSupportCurrentLocation(boolean supportCurrentLocation) {
		this.supportCurrentLocation = supportCurrentLocation;
	}
	public String getUniqueKey() {
		return uniqueKey;
	}
	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}
	public List<TrackNumberInfo> getTrackingInfoList() {
		return trackingInfoList;
	}
	public void setTrackingInfoList(List<TrackNumberInfo> trackingInfoList) {
		this.trackingInfoList = trackingInfoList;
	}
	
	
}
