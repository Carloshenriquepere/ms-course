FROM openjdk:11

VOLUME /tmp

ADD ./target/hr-oauth2-0.0.1-SNAPSHOT.jar hr-oauth2.jar

ENTRYPOINT ["java","-jar","/hr-oauth2.jar"]