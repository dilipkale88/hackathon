package com.pack.tracker.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.tracker.model.TrackPackagesRequest;
import com.pack.tracker.model.TrackPackagesResponse;

@FeignClient(value = "fedextracker", url = "https://www.fedex.com/trackingCal/track")
public interface FedexPackageClient {
 
 
    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    TrackPackagesResponse getPackageDetails(@RequestBody TrackPackagesRequest trackPackagesRequest);
}