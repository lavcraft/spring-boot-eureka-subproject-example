package test;

@org.springframework.boot.autoconfigure.SpringBootApplication
@org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
public class Main {
  public static void main(String args[]) {
    org.springframework.boot.SpringApplication.run(Main.class);
  }
}
