package com.jeesample.cloud;

import com.jeesample.oracle.Oracle;

import javax.inject.Inject;
import javax.json.JsonArray;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("clouds")
public class CloudsResource {

    @Inject
    Oracle oracle;

    @GET
    public JsonArray getClouds(){

    }
}
