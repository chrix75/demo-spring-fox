package com.csp.controllers;

import com.google.common.base.Strings;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by batman on 02/04/2017.
 */
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @ApiOperation("")
    @GetMapping(produces = "application/json")
    ResponseEntity<Map> greeting(@RequestParam(name = "name", required = false) String name) {
        Map<String, String> map = new HashMap<>();

        if (Strings.isNullOrEmpty(name)) {
            map.put("hello", "world");
        } else {
            map.put("hello", name);
        }


        return ResponseEntity.ok(map);
    }

}
