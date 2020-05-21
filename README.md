# quarkus-bug-reproducer

Quarkus 1.5.0.CR1 regressions compared to Quarkus 1.4.2.Final

## Testing steps

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
