# Spring Shell Native

Hi, Spring fans! In this installment we revisit Spring Shell in the context of Spring Shell

## Build 

```shell
mvn clean package 
```

## Build a Native Image
```shell 
mvn -Pnative clean package 
```

This might take a while, so consider skipping tests for the native code: `mvn -Pnative -DskipTests clean package` 

