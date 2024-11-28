package com.tgs.ir.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tgs.ir.config.AppConstant;
import com.tgs.ir.core.BaseResponse;
import com.tgs.ir.core.BaseServiceImpl;
import com.tgs.ir.dto.AdminSanctionsModel;
import com.tgs.ir.dto.TechnicalSanctionsModel;
import com.tgs.ir.entities.AdminSanctionsEntity;
import com.tgs.ir.entities.TechnicalSanctionEntity;

import com.tgs.ir.repositories.AdminSanctionRepo;

@Service
@Transactional
public class AdminSanctionService extends BaseServiceImpl<AdminSanctionsEntity, AdminSanctionsModel, Integer>  {
													
	@Autowired
	AdminSanctionRepo adminSanctionRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);
	

	public BaseResponse<HttpStatus, List<AdminSanctionsModel>>  getAdminSanctionByFinYearByUnit(Integer unit,Integer year){
		
		
		logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_STARTED));
		BaseResponse<HttpStatus, List<AdminSanctionsModel>> responseJson = new BaseResponse<>();
		List<AdminSanctionsEntity> entities = adminSanctionRepo.findByunitIdAndFinancialYearAndIsLatestAndDeleteFlag(unit,year,true,false);
		List<AdminSanctionsModel> models = mapper.mapEntityToModel(entities);
		logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
		responseJson.setSuccess(true);
		responseJson.setData(models);
		
		responseJson.setMessage(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
		responseJson.setStatus(HttpStatus.OK);
		return responseJson;
		
	}
	
public BaseResponse<HttpStatus, AdminSanctionsModel> findbyWorkId(Integer workId){
		logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_STARTED));
		BaseResponse<HttpStatus, AdminSanctionsModel> responseJson = new BaseResponse<>();
		AdminSanctionsEntity entities = adminSanctionRepo.findByworkIdAndIsLatestAndDeleteFlagAndTechnEntriesIsLatestAndTechnEntriesDeleteFlag(workId,true,false,true,false) ;
			AdminSanctionsModel model=new AdminSanctionsModel();
			model.setWorkId(entities.getWorkId());
			model.setAdminSanctionAmt(entities.getAdminSanctionAmt());
	
			model.setApprovedByName(entities.getApprovedByName());
			model.setReferenceNumber(entities.getReferenceNumber());
			model.setReferenceDate(entities.getReferenceDate());
			
			List<TechnicalSanctionsModel> techSanctionModels=new ArrayList<>();
			for(TechnicalSanctionEntity  tech: entities.getTechnEntries()) {
				
				TechnicalSanctionsModel techmodel=new TechnicalSanctionsModel();
				techmodel.setTsApprovedAmount(tech.getTsApprovedAmount());
				techmodel.setTsApprovedDate(tech.getTsApprovedDate());
				techmodel.setTsDate(tech.getTsApprovedDate().toString());
				techmodel.setTsNumber(tech.getTsNumber());
				techSanctionModels.add(techmodel);
			}
		model.setTechlist(techSanctionModels);
		
//	AdminSanctionsModel model = mapper.mapEntityToModel(entities);
		logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
		responseJson.setSuccess(true);
		responseJson.setData(model);
	
		responseJson.setMessage(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
		responseJson.setStatus(HttpStatus.OK);
		
		return responseJson;
		
	}

public BaseResponse<HttpStatus, AdminSanctionsModel> findByunitIdAndFinancialYearAndIsLatestAndDeleteFlagAndTechnEntriesIsLatestAndTechnEntriesTsId(Integer unit,Integer finyear,Boolean isLatest,Boolean deleteFlag,Boolean tech_is_latest,Integer tsId){
	
	
	logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_STARTED));
	BaseResponse<HttpStatus, AdminSanctionsModel> responseJson = new BaseResponse<>();
	AdminSanctionsEntity entities = adminSanctionRepo.findByunitIdAndFinancialYearAndIsLatestAndDeleteFlagAndTechnEntriesIsLatestAndTechnEntriesTsId(unit,finyear,true,false,true,tsId) ;
		AdminSanctionsModel model=new AdminSanctionsModel();
		model.setWorkId(entities.getWorkId());
		List<TechnicalSanctionsModel> techSanctionModels=new ArrayList<>();
		for(TechnicalSanctionEntity  tech: entities.getTechnEntries()) {
			
			TechnicalSanctionsModel techmodel=new TechnicalSanctionsModel();
			techmodel.setTsApprovedAmount(tech.getTsApprovedAmount());
			techmodel.setTsApprovedDate(tech.getTsApprovedDate());
			techmodel.setTsNumber(tech.getTsNumber());
			techSanctionModels.add(techmodel);
		}
	model.setTechlist(techSanctionModels);
	
//	AdminSanctionsModel model = mapper.mapEntityToModel(entities);
	
	logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
	responseJson.setSuccess(true);
	responseJson.setData(model);
	responseJson.setMessage(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
	responseJson.setStatus(HttpStatus.OK);
	System.out.println("model in service"+model);
	System.out.println("responseJson in service"+responseJson.toString());
	return responseJson;
	
}


public BaseResponse<HttpStatus, List<AdminSanctionsModel>>  getAdminSanctionForDEE(Integer unit,Integer divisionId,Integer subDivisionId,Integer year){
	logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_STARTED));
	BaseResponse<HttpStatus, List<AdminSanctionsModel>> responseJson = new BaseResponse<>();
	List<AdminSanctionsEntity> entities = adminSanctionRepo.findByunitIdAndFinancialYearAndIsLatestAndDeleteFlagAndDivisionIdAndSubDivisionIdAndIsAssignedAndTechnEntriesIsLatestAndTechnEntriesDeleteFlag(unit, year, true, false, divisionId, subDivisionId, true, true, false);
	List<AdminSanctionsModel> adminmodels =new ArrayList<>();
	for(AdminSanctionsEntity  admin: entities) {
		AdminSanctionsModel model=new AdminSanctionsModel();
		model.setWorkId(admin.getWorkId());
		model.setWorkName(admin.getWorkName());
		
		adminmodels.add(model);
	}
	logger.debug(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
	responseJson.setSuccess(true);
	responseJson.setData(adminmodels);
	responseJson.setMessage(appConstant.getValue(AppConstant.GET_SERVICE_SUCCESS));
	responseJson.setStatus(HttpStatus.OK);
	
	return responseJson;
	
}
	
}
