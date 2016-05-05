package san.java.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/*
 * REST Resource
 */

@Controller
@RequestMapping("/env")
public class EnvController {

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    List listEmployees() throws IOException {
    	System.out.println("EnvController:" + environment.getProperty("key1"));
    	System.out.println("EnvController:" + environment.getProperty("key2"));
    	List<String> list = new ArrayList<String>();
    	list.add(environment.getProperty("key1"));
    	list.add(environment.getProperty("key2"));
        return list;
    }



}
