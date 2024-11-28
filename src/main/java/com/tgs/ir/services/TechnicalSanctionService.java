package com.tgs.ir.services;

import java.util.List;

import java.util.ArrayList;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tgs.ir.config.AppConstant;
import com.tgs.ir.core.BaseResponse;
import com.tgs.ir.core.BaseServiceImpl;
import com.tgs.ir.dto.AdminSanctionsModel;
import com.tgs.ir.dto.TechnicalSanctionsModel;
import com.tgs.ir.entities.AdminSanctionsEntity;
import com.tgs.ir.entities.TechnicalSanctionEntity;
import com.tgs.ir.repositories.AdminSanctionRepo;
import com.tgs.ir.repositories.TechnicalSanctionRepo;

@Service
@Transactional
public class TechnicalSanctionService extends BaseServiceImpl<TechnicalSanctionEntity, TechnicalSanctionsModel, Integer> {
	
	
@Autowired
TechnicalSanctionRepo technicalSanctionRepo;

private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

public void insertTechnicalSanctions(List<TechnicalSanctionsModel> list) {
	
	if(list!=null) {
		saveAll(list);
	}else {
		
	}
}

public BaseResponse<HttpStatus, List<TechnicalSanctionsModel>>  getTechnicalSanctionByWorkId(Integer workId){
	logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_STARTED));
	BaseResponse<HttpStatus, List<TechnicalSanctionsModel>> responseJson = new BaseResponse<>();
	List<TechnicalSanctionEntity> entities = technicalSanctionRepo.findByworkIdAndIsLatestTrueAndDeleteFlagFalse(workId);
	List<TechnicalSanctionsModel> techmodels =new ArrayList<>();
	for(TechnicalSanctionEntity  admin: entities) {
		TechnicalSanctionsModel model=new TechnicalSanctionsModel();
		model.setTsId(admin.getTsId());
		model.setTsNumber(admin.getTsNumber());
		
		techmodels.add(model);
	}
	logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
	responseJson.setSuccess(true);
	responseJson.setData(techmodels);
	responseJson.setMessage(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
	responseJson.setStatus(HttpStatus.OK);
	return responseJson;
	
}
}
