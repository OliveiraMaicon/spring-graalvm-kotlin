# Spring + Graalvm + Koltin


## Intalações

- [Graalvm on linux]("https://www.graalvm.org/docs/getting-started/linux")


## Build

#### Usando -> Agent

    mkdir -p src/main/resources/META-INF/native-image
    mvn clean package
    java -agentlib:native-image-agent=config-output-dir=src/main/resources/META-INF/native-image   -jar target/kotlin-spring-*.jar

#### Usando -> Feature
    
    mvn -Pnative clean package
    ./targer/kotlin-spring
    
 