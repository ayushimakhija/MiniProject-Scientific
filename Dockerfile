FROM openjdk:8
MAINTAINER ayushi Makhija ayushi9yn.19@gmail.com
COPY ./target/Scientific_calc-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "Scientific_calc-1.0-SNAPSHOT.jar","Calculator"]