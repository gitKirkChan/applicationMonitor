package com.fedex.plefs.system.console.api;

import com.fedex.plefs.system.console.domain.CloudOpsServers;
import com.fedex.plefs.system.console.domain.server.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class ApiTestingController {

//    @Autowired
//    private ApplicationProperties info;

    private final CloudOpsServers cloudOpsInfo;

    @Autowired
    public ApiTestingController(CloudOpsServers cloudOpsInfo) {
        this.cloudOpsInfo = cloudOpsInfo;
    }

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/servers/dev")
    @ResponseBody
    public List<Server> dev() {
        return cloudOpsInfo.getDev();
    }

    @RequestMapping("/servers/test")
    @ResponseBody
    public List<Server> test() {
        return cloudOpsInfo.getTest();
    }

}