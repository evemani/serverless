package com.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.serverless.demo.model.ServerlessInput;

public class DemoHandler implements RequestHandler<ServerlessInput, GatewayResponse> {

	@Override
	public GatewayResponse handleRequest(ServerlessInput input, Context context) {
		// TODO Auto-generated method stub
		return new GatewayResponse(200, "verma help2", GatewayResponse.HEADERS_JSON);
	}

}
