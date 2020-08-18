package org.redhat.appdev;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface PredictFraud {

    @GET
    @Path("/predict")
    @Produces("application/json")
    PredictionResponse get();
}