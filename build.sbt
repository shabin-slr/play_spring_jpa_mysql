name := "play-spring-data-jpa"

version := "1.0-SNAPSHOT"

playJavaSettings

ebeanEnabled := false

libraryDependencies ++= Seq(
    javaCore,
    javaJpa,
    javaJdbc,
    "javax.inject" % "javax.inject" % "1",
    "org.springframework" % "spring-core" % "4.3.3.RELEASE",
    "org.springframework" % "spring-context" % "4.3.3.RELEASE",
    "org.springframework" % "spring-jdbc" % "4.3.4.RELEASE",
    "org.springframework.data" % "spring-data-jpa" % "1.10.1.RELEASE",
    "org.springframework" % "spring-expression" % "4.3.3.RELEASE",
    "org.hibernate" % "hibernate-entitymanager" % "3.6.10.Final",
    "org.mockito" % "mockito-core" % "1.9.5" % "test",
    "mysql" % "mysql-connector-java" % "5.1.36"
)