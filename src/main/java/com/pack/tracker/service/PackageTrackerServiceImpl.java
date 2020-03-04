package com.pack.tracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pack.tracker.client.FedexPackageClient;
import com.pack.tracker.model.TrackNumberInfo;
import com.pack.tracker.model.TrackPackagesRequest;
import com.pack.tracker.model.TrackPackagesResponse;

public class PackageTrackerServiceImpl implements FedexPackageClient{
 
 private final FedexPackageClient packageClient;
 
 @Autowired
 public PackageTrackerServiceImpl(FedexPackageClient packageClient) {
    // this.packageClient = null;
	this.packageClient = packageClient;
 }
 
 public PackageTrackerServiceImpl() {
	this.packageClient = null;
	 
 }
 
 public TrackPackagesResponse getPackageDetails(String trackingId) {
	 TrackPackagesRequest trackPackagesRequest = new TrackPackagesRequest();
	 trackPackagesRequest.setAppType("WTRK");
	 trackPackagesRequest.setAppDeviceType("DESKTOP");
	 TrackNumberInfo  trackNumberInfo = new TrackNumberInfo();
	 List<TrackNumberInfo> trackInfoList = new ArrayList<TrackNumberInfo>();
	 trackNumberInfo.setTrackingNumber("453243776845");
	 trackInfoList.add(trackNumberInfo);
	 trackPackagesRequest.setTrackingInfoList(trackInfoList);
	 TrackPackagesResponse trackPackagesResponse = getPackageDetails(trackPackagesRequest);
	 System.out.println("here");
	 return trackPackagesResponse;
 }

@Override
public TrackPackagesResponse getPackageDetails(TrackPackagesRequest trackPackagesRequest) {
	 TrackPackagesResponse trackPackagesResponse = packageClient.getPackageDetails(trackPackagesRequest);
	 System.out.println("here");
	 return trackPackagesResponse;
 }
}
 

