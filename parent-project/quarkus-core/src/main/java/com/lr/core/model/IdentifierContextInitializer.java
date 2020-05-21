/*-
 * #%L
 * Project Name: Boreas
 * %%
 * Copyright (C) 2019 - 2020 LogRhythm, Inc. All rights reserved.
 * %%
 * Protected by copyright and licenses restricting use, copying, distribution and decompilation.
 *
 * THE SOFTWARE IS PROTECTED BY UNITED STATES COPYRIGHT LAW AND INTERNATIONAL TREATIES.
 * UNAUTHORIZED REPRODUCTION OR DISTRIBUTION IS SUBJECT TO CIVIL AND CRIMINAL PENALTIES.
 * #L%
 */
package com.lr.core.model;

import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

/**
 * This interface is used by the ProtoStream compile processor to generate a concrete
 *
 * <p>{@link SerializationContextInitializer} for the Identifier. It also
 * generates a ProtoStream Marshaller for the Identifier. The Marshaller is used by Infinispan
 * (Cache Provider) to serialize the entity.
 *
 * @see <a href="https://confluence.logrhythm.com/display/NGP/Proposed+Caching+Architecture"/>
 */
@AutoProtoSchemaBuilder(
    includeClasses = {Identifier.class},
    schemaPackageName = "com.lr.core.v1.initializer")
public interface IdentifierContextInitializer extends SerializationContextInitializer {}
