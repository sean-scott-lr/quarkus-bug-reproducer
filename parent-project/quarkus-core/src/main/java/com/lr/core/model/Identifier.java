package com.lr.core.model;

import org.infinispan.protostream.annotations.ProtoField;

public class Identifier {
    private String someString;

    @ProtoField( number = 1)
    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }
}
