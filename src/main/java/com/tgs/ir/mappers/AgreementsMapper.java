package com.tgs.ir.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.tgs.ir.core.BaseMapperImpl;
import com.tgs.ir.dto.AgreementsModel;
import com.tgs.ir.entities.AgreementsEntity;

@Component
public class AgreementsMapper extends BaseMapperImpl<AgreementsEntity, AgreementsModel> {
	

	@Override
	public AgreementsModel mapEntityToModel(AgreementsEntity entity) {
		// TODO Auto-generated method stub
		AgreementsModel model = new AgreementsModel();
		BeanUtils.copyProperties(entity, model);
		return model;
	}

	@Override
	public AgreementsEntity mapModelToEntity(AgreementsModel model) {
		// TODO Auto-generated method stub
		AgreementsEntity entity = new AgreementsEntity();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}

}
