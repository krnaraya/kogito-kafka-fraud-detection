package org.redhat.appdev;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/predict")
public class PredictFraud {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String predictFraud() {
        return "fraud detected";
    }
}