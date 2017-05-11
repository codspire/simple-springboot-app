# simple-springboot-app
Simple Spring Boot App for AWS hands-on


## Bootstraping using EC2 User Data
``` sh
sudo yum update -y
```
``` sh
sudo yum install git -y

sudo yum install java-1.8.0 -y

sudo yum remove java-1.7.0-openjdk -y
```

``` sh
wget https://raw.githubusercontent.com/codspire/simple-springboot-app/master/distribution/simple-springboot-app-0.1.0.jar

sudo java -jar simple-springboot-app-0.1.0.jar
```
Access: http://"ec2 public url"

## Deploying Using Elastic Beanstalk
https://aws.amazon.com/blogs/devops/deploying-a-spring-boot-application-on-aws-using-aws-elastic-beanstalk/
https://pragmaticintegrator.wordpress.com/2016/07/12/run-your-spring-boot-application-on-aws-using-elastic-beanstalk/
https://exampledriven.wordpress.com/2017/01/09/spring-boot-aws-elastic-beanstalk-example/
