package com.benchmarking.springbootserver;

import com.benchmarking.benchmarking.BigObject;

import java.util.List;

public class GetBigObjectResponse {
    public List<BigObject> getBigObjects() {
        return bigObjects;
    }

    public void setBigObjects(List<BigObject> bigObjects) {
        this.bigObjects = bigObjects;
    }

    List<BigObject> bigObjects;

    public GetBigObjectResponse(List<BigObject> bigObjects) {
        this.bigObjects = bigObjects;
    }
}
