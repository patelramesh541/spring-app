package org.ramesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/toGet")
    public String toGet() {
        return "super.toString();";
    }
}
