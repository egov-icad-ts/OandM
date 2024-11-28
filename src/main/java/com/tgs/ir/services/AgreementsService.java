package com.tgs.ir.services;

import java.io.Console;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tgs.ir.core.BaseServiceImpl;
import com.tgs.ir.dto.AgreementsModel;
import com.tgs.ir.entities.AgreementsEntity;
import com.tgs.ir.entities.TechnicalSanctionEntity;
import com.tgs.ir.repositories.AgreementsRepo;
import com.tgs.ir.repositories.TechnicalSanctionRepo;

@Service
@Transactional
public class AgreementsService extends BaseServiceImpl<AgreementsEntity, AgreementsModel, Integer> {
	
@Autowired
private TechnicalSanctionRepo techRepo;

@Autowired
private AgreementsRepo agreementsRepo;

private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

public void insertAgreements(AgreementsModel agreements) {
	
	System.out.println("agreements:"+ agreements);
	
	if(agreements!=null) {
		create(agreements);
	}else {
		
	}
}

}
