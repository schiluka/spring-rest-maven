package san.java.spring.rest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalConfigComponent {
	
  @Value("${key1}")
  public String propertyOne;
  
  @Value("${key2}")
  public String propertyTwo;
  
  @PostConstruct
  public void postConstruct(){
    System.out.println("Property One: " + propertyOne);
    System.out.println("Property Two: " + propertyTwo);
  }
}

