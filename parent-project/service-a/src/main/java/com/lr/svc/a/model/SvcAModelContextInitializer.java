package com.lr.svc.a.model;

import com.lr.core.model.IdentifierContextInitializer;
import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(
        dependsOn = IdentifierContextInitializer.class,
        includeClasses = SvcAModel.class)
public interface SvcAModelContextInitializer extends SerializationContextInitializer {}