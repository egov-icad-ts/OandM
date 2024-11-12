package com.tgs.ir.services;

import com.tgs.ir.entities.District;
import com.tgs.ir.repositories.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    DistrictRepository districtRepository;

    public List<District> getDistricts(){

        return districtRepository.findAll();
    }
}
