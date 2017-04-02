package com.csp.controllers;

import com.csp.domain.MyDomainObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by batman on 02/04/2017.
 */
@RestController
@RequestMapping("/domain")
public class MyDomainController {

    @ApiOperation("")
    @GetMapping(produces = "application/json")
    ResponseEntity<MyDomainObject> getDomain() {
        MyDomainObject domain = new MyDomainObject();
        domain.setName("A domain object");
        domain.setValue(5);

        return ResponseEntity.ok(domain);
    }

    @PostMapping(produces = "application/json")
    ResponseEntity<MyDomainObject> saveDomain(@ApiParam("Nom du domain") @RequestParam String name,
                                              @ApiParam("Valeur du domain") @RequestParam int value) {
        MyDomainObject domain = new MyDomainObject();
        domain.setName(name);
        domain.setValue(value);

        return ResponseEntity.ok(domain);
    }
}
