package com.benchmark.benchmarkclient;

import com.benchmarking.grpc.GetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class BenchmarkController {
    @Autowired
    SampleGrpcClientService sampleGrpcClientService;

    @Autowired
    SampleRestClientService sampleRestClientService;

    @RequestMapping(path = "/grpc", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetResponse grpcGet() {
        return sampleGrpcClientService.getBigObjects();
    }

    @RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetBigObjectResponse restGet() {
        return sampleRestClientService.getBigObjects();
    }
}
