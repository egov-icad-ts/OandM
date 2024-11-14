package com.tgs.ir.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tgs.ir.core.BaseResponse;
import com.tgs.ir.dto.AdminSanctionsModel;
import com.tgs.ir.services.AdminSanctionService;

@RestController
@RequestMapping("/OandMWorks")
public class OAndMController  {

	@Autowired
    AdminSanctionService adminSanctionService;

	 @GetMapping("/adminSanctions")
	    public ResponseEntity<BaseResponse<HttpStatus,  List<AdminSanctionsModel>>> getAdminSanctions(Integer unit,Integer finyear) {
	        BaseResponse<HttpStatus, List<AdminSanctionsModel>> response = adminSanctionService.getAdminSanctionByFinYearByUnit(unit,finyear);
	        return new ResponseEntity<>(response, response.getStatus());
	    }
	 @CrossOrigin(origins = "http://localhost:3000")
	 @GetMapping("/adminSanctionsByworkId")
	    public ResponseEntity<BaseResponse<HttpStatus,  AdminSanctionsModel>> getAdminSanctionsByworkId(@RequestParam Integer workId) {
	        BaseResponse<HttpStatus, AdminSanctionsModel> response = adminSanctionService.findbyWorkId(workId);
	        return new ResponseEntity<>(response, response.getStatus());
	    }
	 
	 @GetMapping("/adminSanctionsByworkIdAndTechnicalSanctionTechId")
	    public ResponseEntity<BaseResponse<HttpStatus,  AdminSanctionsModel>> getAdminSanctionsByTechId(Integer unit,Integer finYear,Integer tsId) {
	        BaseResponse<HttpStatus, AdminSanctionsModel> response = adminSanctionService.findByunitIdAndFinancialYearAndIsLatestAndDeleteFlagAndTechnEntriesIsLatestAndTechnEntriesTsId(unit, finYear, true, false, true, tsId);
	        return new ResponseEntity<>(response, response.getStatus());
	    }
	 @CrossOrigin(origins = "http://localhost:3000")
	 @GetMapping("/O&MWorksTechnicalSanction")
	    public ResponseEntity<BaseResponse<HttpStatus,   List<AdminSanctionsModel>>> getAdminSanctionsForDEE(@RequestParam Integer unitId,@RequestParam Integer divisionId,@RequestParam Integer subDivisionId ,@RequestParam Integer finyear) {
	        BaseResponse<HttpStatus,  List<AdminSanctionsModel>> response = adminSanctionService.getAdminSanctionForDEE(unitId, divisionId,subDivisionId,finyear);
	        return new ResponseEntity<>(response, response.getStatus());
	    }
	
}
