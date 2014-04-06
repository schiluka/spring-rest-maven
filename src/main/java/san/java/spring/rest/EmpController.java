package san.java.spring.rest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/*
 * REST Resource
 */

@Controller
@RequestMapping("/employees")
public class EmpController {

    Map<Integer, Employee> employees = new HashMap();

    public EmpController() {
    	employees.put(1, new Employee("Jacky", "Admin"));
    	employees.put(2, new Employee("Rocky", "Manager"));
    }

    // Resource /employees
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    Map<Integer, Employee> listEmployees() throws IOException {
        return employees;
    }

    // Resource /employee/{id}
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    Employee getMovie(@PathVariable("id") Integer id, HttpServletResponse response) throws IOException {
        if (employees.containsKey(id)) return employees.get(id);
        response.sendError(400, "Employee \"" + id + "\" does not exist.\n");
        return new Employee("", ""); // Dummy return
    }

}
