package com.tgs.ir.repositories;

import java.util.List;

import com.tgs.ir.core.BaseRepository;
import com.tgs.ir.dto.TechnicalSanctionsModel;
import com.tgs.ir.entities.AdminSanctionsEntity;
import com.tgs.ir.entities.TechnicalSanctionEntity;


public interface TechnicalSanctionRepo   extends  BaseRepository<TechnicalSanctionEntity, Integer>{

	/*
	 * public List<AdminSanctionsEntity>
	 * findByunitIdAndFinancialYearAndIsLatestAndDeleteFlag(Integer unit,Integer
	 * finyear,Boolean isLatest,Boolean deleteFlag);
	 */
	
	/* public void saveAll(List<TechnicalSanctionsModel> techlist); */
	public List<TechnicalSanctionEntity> findByworkIdAndIsLatestTrueAndDeleteFlagFalse(Integer workId);

}
