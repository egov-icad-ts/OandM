package com.tgs.ir.user;

import com.tgs.ir.core.BaseMapperImpl;
import com.tgs.ir.user.UserEntity;
import com.tgs.ir.user.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


@Component
public class UserMapper extends BaseMapperImpl<UserEntity, UserModel> {
	@Override
	public UserModel mapEntityToModel(UserEntity entity) {
		UserModel model = new UserModel();
		BeanUtils.copyProperties(entity, model);
		model.setId(entity.getId());		
		return model;
	}

	@Override
	public UserEntity mapModelToEntity(UserModel model) {
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}
}
