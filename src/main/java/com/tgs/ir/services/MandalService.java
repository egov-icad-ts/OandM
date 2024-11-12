package com.tgs.ir.services;

import com.tgs.ir.dto.DistrictDto;
import com.tgs.ir.dto.MandalDto;
import com.tgs.ir.entities.District;
import com.tgs.ir.entities.Mandal;
import com.tgs.ir.repositories.MandalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MandalService {

    @Autowired
    MandalRepository MandalRepository;

    public List<MandalDto> getMandals(){
        List<Mandal> mandals = MandalRepository.findAll();
        List<MandalDto> mandalDtos = new ArrayList<MandalDto>();
        for (Mandal mandal:mandals) {
            MandalDto mandalDto = new MandalDto();
            mandalDto.setActive(mandal.getActive());
            mandalDto.setMcode(mandal.getMcode());
            mandalDto.setMname(mandal.getMname());
            District district = mandal.getDistrict();
            DistrictDto ddto = new DistrictDto(district.getDcode(), district.getDname());
            mandalDto.setDistrict(ddto);
            mandalDtos.add(mandalDto);
        }
        return mandalDtos;
    }


}
