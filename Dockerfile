FROM tomcat

WORKDIR /app

COPY target/azure_pipelines_demo-0.0.1-SNAPSHOT.jar /app/azure_pipelines_demo-0.0.1-SNAPSHOT.jar


EXPOSE 8080

CMD ["java", "-jar", "azure_pipelines_demo-0.0.1-SNAPSHOT.jar"]
