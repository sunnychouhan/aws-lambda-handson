package com.chousun.lambdahandson;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.function.Function;

@Slf4j
public class HelloLambda implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent requestEvent) {
        log.info("Started Computing From Lambda with Request :" + requestEvent.toString());
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
        response.setStatusCode(200);
        HashMap<String, String> headers = new HashMap();
        headers.put("Content-Type", "application/json");
        response.setHeaders(headers);
        response.setBody("Serving Response from Aws Lambda, Here is your input message : " + requestEvent.getBody());
        log.info("Completed Computing From Lambda with Responce :" + response.toString());
        return response;
    }
}
