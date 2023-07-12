package com.benchmarking.springbootserver;

import com.benchmarking.benchmarking.BigObject;
import com.benchmarking.benchmarking.E;
import com.benchmarking.benchmarking.FClass;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleService {
    static List<BigObject> bigObjects = new ArrayList<>();

    public SampleService() {
        init();
    }

    public void init() {
        if (bigObjects.isEmpty()) {
            for (int i = 0; i < 1; i++) {
                BigObject bigObject = generatePojoObj();
                bigObjects.add(bigObject);
            }
        }
    }

    public List<BigObject> getPojoObjList() {
        return bigObjects;
    }

    private BigObject generatePojoObj() {
        return BigObject.builder()
                .f1(1L)
                .f2(2L)
                .f3(3L)
                .f4(4L)
                .f5(5L)
                .f6(6L)
                .f7(7L)
                .f8(8L)
                .f9(9L)
                .f10(10L)
                .f11("string")
                .f12("string")
                .f13("string")
                .f14("string")
                .f15("string")
                .f16("string")
                .f17("string")
                .f18("string")
                .f19("string")
                .f20("string")
                .f21(true)
                .f22(true)
                .f23(true)
                .f24(true)
                .f25(true)
                .f26(true)
                .f27(true)
                .f28(true)
                .f29(true)
                .f30(true)
                .f31(1)
                .f32(1)
                .f33(1)
                .f34(1)
                .f35(1)
                .f36(1)
                .f37(1)
                .f38(1)
                .f39(1)
                .f40(1)
                .f41(2)
                .f42(2)
                .f43(2)
                .f44(2)
                .f45(2)
                .f46(2)
                .f47(2)
                .f48(2)
                .f49(2)
                .f50(2)
                .f51(E.E1)
                .f52(E.E2)
                .f53(E.E3)
                .f54(E.E4)
                .f55(E.E5)
                .f56(E.E5)
                .f57(E.E5)
                .f58(E.E5)
                .f59(E.E5)
                .f60(E.E5)
                .f61(fClassGenerate())
                .f62(fClassGenerate())
                .f63(fClassGenerate())
                .f64(fClassGenerate())
                .f65(fClassGenerate())
                .f66(fClassGenerate())
                .f67(fClassGenerate())
                .f68(fClassGenerate())
                .f69(fClassGenerate())
                .f70(fClassGenerate())
                .build();

    }

    private FClass fClassGenerate() {
        return FClass
                .builder()
                .FClass1(1L)
                .FClass2(1L)
                .FClass3(1L)
                .FClass4(1L)
                .FClass5(1L)
                .FClass6(1L)
                .FClass7(1L)
                .FClass8(1L)
                .FClass9(1L)
                .FClass10(1L)
                .build();
    }
}
