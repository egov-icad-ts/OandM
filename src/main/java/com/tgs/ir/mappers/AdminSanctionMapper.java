package com.tgs.ir.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.tgs.ir.core.BaseMapperImpl;
import com.tgs.ir.dto.AdminSanctionsModel;
import com.tgs.ir.entities.AdminSanctionsEntity;

@Component
public class AdminSanctionMapper extends BaseMapperImpl<AdminSanctionsEntity, AdminSanctionsModel>{

	@Override
	public AdminSanctionsModel mapEntityToModel(AdminSanctionsEntity entity) {
		// TODO Auto-generated method stub
		
		AdminSanctionsModel model = new AdminSanctionsModel();
		BeanUtils.copyProperties(entity, model);
		return model;
	}

	@Override
	public AdminSanctionsEntity mapModelToEntity(AdminSanctionsModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
