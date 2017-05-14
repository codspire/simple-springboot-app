FROM anapsix/docker-oracle-java8

# Creating working directory
WORKDIR /app

# Add src to working directory
ADD distribution/simple-springboot-app-0.1.0.jar /app/simple-springboot-app-0.1.0.jar

EXPOSE 80

# Start app
ENTRYPOINT ["java","-jar","/app/simple-springboot-app-0.1.0.jar"]
