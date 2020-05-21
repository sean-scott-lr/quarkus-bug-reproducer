package com.lr.svc.a.model;

import com.lr.core.model.Identifier;
import org.infinispan.protostream.annotations.ProtoField;
import org.jsoup.select.Evaluator;

public class SvcAModel {
    private Identifier id;

    public SvcAModel(){

    }

    public SvcAModel(String someString){
        id = new Identifier();
        id.setSomeString(someString);
    }

    @ProtoField( number = 1)
    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }
}
