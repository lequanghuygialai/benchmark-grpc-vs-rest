package com.benchmarking.springbootserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    SampleService sampleService;

    @GetMapping("/")
    public GetBigObjectResponse get() {
        return new GetBigObjectResponse(sampleService.getPojoObjList());
    }
}