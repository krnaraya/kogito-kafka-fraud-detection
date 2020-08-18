package org.redhat.appdev;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;

@ApplicationScoped
public class PredictService {


    @Inject
    @RestClient
    PredictFraud predictFraudService;
    
    private static final Logger logger = LoggerFactory.getLogger(PredictService.class);

    public PredictionResponse get() {
        return predictFraudService.get();
    }
    
    public Transaction predictFraud(Transaction transaction) {
     
        logger.info("Transaction {} is being checking for fraud", transaction.toString());

        if (transaction.getLocation().equalsIgnoreCase("Rest of the World")) {
            transaction.setIsFraud(false);
        }
        else {
            transaction.setIsFraud(true);
        }

        

        return transaction;
        
    }

}