package san.java.spring.rest;

import org.codehaus.jackson.annotate.JsonProperty;


public final class Employee {

    @JsonProperty
    private String name;

    @JsonProperty
    private String role;

    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
