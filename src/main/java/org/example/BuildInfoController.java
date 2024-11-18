package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildInfoController {

    @Value("${project.version}")
    private String version;

    @Value("${buildNumber:unknown}")
    private String buildNumber;

    @GetMapping("/info")
    public String getBuildInfo() {
        return "Version: " + version + "<br>Revision: " + buildNumber;
    }
}
