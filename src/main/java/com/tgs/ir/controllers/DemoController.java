package com.tgs.ir.controllers;

import com.tgs.ir.dto.MandalDto;
import com.tgs.ir.entities.District;
import com.tgs.ir.services.DistrictService;
import com.tgs.ir.services.MandalService;
import com.tgs.ir.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    UserService userService;
    @Autowired
    DistrictService districtService;
    @Autowired
    MandalService mandalService;


    @GetMapping("/districts")
    public ResponseEntity<List<District>> getDistricts() {
        try{
            List<District> districts = districtService.getDistricts();
            return new ResponseEntity<>(districts,HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }


    @GetMapping("/mandals")
    public ResponseEntity<List<MandalDto>> getMandals() {
        try{
            List<MandalDto> mandals = mandalService.getMandals();
            return new ResponseEntity<>(mandals,HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
