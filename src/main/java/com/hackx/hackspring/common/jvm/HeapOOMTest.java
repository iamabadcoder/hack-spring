package com.hackx.hackspring.common.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackx on 11/8/16.
 */
public class HeapOOMTest {

    public static void main(String[] args) {
        List<HeapOOMTest> list = new ArrayList<>();
        while (true){
            list.add(new HeapOOMTest());
        }
    }

}
