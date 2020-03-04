package com.pack.tracker.model;

import java.util.List;

public class TrackPackagesResponse {
	boolean successful;
	List<PackageDetails> packageList;
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	public List<PackageDetails> getPackageList() {
		return packageList;
	}
	public void setPackageList(List<PackageDetails> packageList) {
		this.packageList = packageList;
	}
	
	
}
