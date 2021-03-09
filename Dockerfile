FROM openjdk:8
COPY ./target/Scientific_calc-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Scientific_calc-1.0-SNAPSHOT.jar", "Calculator"]