FROM openjdk:17
EXPOSE 8080
COPY target/EmployeePortal.jar EmployeePortal.jar
ENTRYPOINT ["java","-jar","/EmployeePortal.jar"]