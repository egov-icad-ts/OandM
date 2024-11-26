package com.tgs.ir.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tgs.ir.core.BaseRepository;
import com.tgs.ir.entities.AdminSanctionsEntity;
import com.tgs.ir.entities.District;


public interface AdminSanctionRepo  extends  BaseRepository<AdminSanctionsEntity, Integer>{
	
public List<AdminSanctionsEntity> findByunitIdAndFinancialYearAndIsLatestAndDeleteFlag(Integer unit,Integer finyear,Boolean isLatest,Boolean deleteFlag);


public AdminSanctionsEntity findByunitIdAndFinancialYearAndIsLatestAndDeleteFlagAndTechnEntriesIsLatestAndTechnEntriesTsId(Integer unit,Integer finyear,Boolean isLatest,Boolean deleteFlag,Boolean tech_is_latest,Integer tsId);

public AdminSanctionsEntity findByworkIdAndIsLatestAndDeleteFlagAndTechnEntriesIsLatestAndTechnEntriesDeleteFlag(Integer workId,Boolean isLatest,Boolean deleteFlag,Boolean tech_is_latest,Boolean tech_delete_flag);

public List<AdminSanctionsEntity> findByunitIdAndFinancialYearAndIsLatestAndDeleteFlagAndDivisionIdAndSubDivisionIdAndIsAssignedAndTechnEntriesIsLatestAndTechnEntriesDeleteFlag
(Integer unit,Integer finyear,Boolean isLatest,Boolean deleteFlag,Integer DivisionId,Integer SubDivisionId,Boolean isAssigned,Boolean tech_is_latest,Boolean deleteflag);



}
