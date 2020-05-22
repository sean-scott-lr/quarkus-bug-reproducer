# quarkus-bug-reproducer

Quarkus 1.5.0.CR1 regressions compared to Quarkus 1.4.2.Final

## Testing steps

### Start Infinispan

  -v $(pwd)/infinispan/entrypoint.sh:/opt/infinispan/server/test-entrypoint.sh \
```
docker run -d --rm -p 11222:11222 \
  -v $(pwd)/infinispan/infinispan.xml:/opt/infinispan/server/conf/infinispan.xml \
  --entrypoint /opt/infinispan/bin/server.sh \
  infinispan/server:10.1.3.Final
```

### Verify test case works in Quarkus 1.4.2.Final

```
cd parent-project
mvn clean
mvn test
```

### Attempt same test case in Quarkus 1.5.0.CR1

```
cd parent-project
mvn clean
mvn test -Pquarkus-1.5.0.CR1
```
