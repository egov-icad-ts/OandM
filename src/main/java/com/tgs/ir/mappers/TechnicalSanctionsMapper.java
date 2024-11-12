package com.tgs.ir.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.tgs.ir.core.BaseMapperImpl;

import com.tgs.ir.dto.TechnicalSanctionsModel;

import com.tgs.ir.entities.TechnicalSanctionEntity;

@Component
public class TechnicalSanctionsMapper extends BaseMapperImpl<TechnicalSanctionEntity, TechnicalSanctionsModel> {

	@Override
	public TechnicalSanctionsModel mapEntityToModel(TechnicalSanctionEntity entity) {
		// TODO Auto-generated method stub
		TechnicalSanctionsModel model = new TechnicalSanctionsModel();
		BeanUtils.copyProperties(entity, model);
		return model;
	}

	@Override
	public TechnicalSanctionEntity mapModelToEntity(TechnicalSanctionsModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
