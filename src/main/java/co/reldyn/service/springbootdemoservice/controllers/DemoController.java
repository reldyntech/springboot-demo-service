package co.reldyn.service.springbootdemoservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    /**
     * Welcome
     */
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Alibaba Cloud TechMeet 2020!!";
    }


    /**
     * Get the host networking information
     */
    @GetMapping("/netinfo")
    public Map<String, String> netinfo() {
        Map<String, String> map = new HashMap<>();
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            map.put("message", "Welcome to Alibaba TechMeet 2020!");
            map.put("hostname", inetAddress.getHostName());
            map.put("ipAddress", inetAddress.getHostAddress());
            return map;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return map;
        }
    }
}
