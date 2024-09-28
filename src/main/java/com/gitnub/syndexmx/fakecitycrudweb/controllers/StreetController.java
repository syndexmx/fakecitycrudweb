package com.gitnub.syndexmx.fakecitycrudweb.controllers;

import com.gitnub.syndexmx.fakecitycrudweb.domain.Street;
import com.gitnub.syndexmx.fakecitycrudweb.domain.StreetEntity;
import com.gitnub.syndexmx.fakecitycrudweb.services.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreetController {

    private final StreetService streetService;

    @Autowired
    public StreetController(final StreetService streetService) {
        this.streetService = streetService;
    }

    @GetMapping(path = "/streets")
    public ResponseEntity<List<Street>> listStreets() {
        return new ResponseEntity<List<Street>>(streetService.listStreets(), HttpStatus.OK);
    }

    @PutMapping (path = "/createstreet")
    public ResponseEntity<Street> createStreet(@RequestBody final Street street) {
        final Street savedStreet = streetService.saveStreet(street);
        return new ResponseEntity<Street>(savedStreet, HttpStatus.CREATED);
    }
}
