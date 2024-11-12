package com.tgs.ir.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tgs.ir.core.BaseServiceImpl;
import com.tgs.ir.dto.TechnicalSanctionsModel;
import com.tgs.ir.entities.TechnicalSanctionEntity;
import com.tgs.ir.repositories.AdminSanctionRepo;
import com.tgs.ir.repositories.TechnicalSanctionRepo;

@Service
@Transactional
public class TechnicalSanctionService extends BaseServiceImpl<TechnicalSanctionEntity, TechnicalSanctionsModel, Integer> {
	
	
@Autowired
TechnicalSanctionRepo technicalSanctionRepo;

private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

}
