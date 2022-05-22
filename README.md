# spring-boot-demo
spring-boot maven project

## Specifications
- spring-boot v2.6.7
- java 1.8.0_191
- maven
- data-jpa
- lombok
- h2

## Local Machine Maven Version
- 3.6.0

## Maven Run Command
```bash
$ mvn spring-boot:run
```

## H2 Database Value Setting File Location
/src/main/resources/application.properties.bak

## Import project (Eclipse or STS)
### pom.xml 파일 에러가 날 경우
> Pom.xml line1 Maven Configuration Problem Unknown error

`pom.xml`내에 `properties` 태그 하위에 메이븐 플러그인 버전 추가.

```xml
<properties>
	<java.version>1.8</java.version>
    <maven-jar-plugin.version>3.1.1</maven-jar-plugin.version>
</properties>
```

Maven -> Update project... 실행