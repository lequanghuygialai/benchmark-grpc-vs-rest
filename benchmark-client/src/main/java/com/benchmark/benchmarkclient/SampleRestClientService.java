package com.benchmark.benchmarkclient;

import com.benchmarking.benchmarking.BigObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SampleRestClientService {

    private final RestTemplate restTemplate;

    public SampleRestClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GetBigObjectResponse getBigObjects(){
       return restTemplate.getForObject("http://127.0.0.1:8080", GetBigObjectResponse.class);
    }
}

class GetBigObjectResponse{
    public List<BigObject> getBigObjects() {
        return bigObjects;
    }

    public void setBigObjects(List<BigObject> bigObjects) {
        this.bigObjects = bigObjects;
    }

    List<BigObject> bigObjects;
}
