package com.tgs.ir.user;

import com.tgs.ir.context.ApiContext;
import com.tgs.ir.context.ThreadLocalWithApiContext;
import com.tgs.ir.core.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService extends BaseServiceImpl<UserEntity, UserModel, Integer>  {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	//Deactivate the user
	public boolean deactivateUser(Integer id){
		try{
			Optional<UserEntity> existUser = userRepository.findById(id);
			if(existUser.isPresent()){
				// Set active false
				existUser.get().setActive(false);
				//Update the user
				userRepository.save(existUser.get());
				return true;
			}
			return false;
		}catch(Exception ex){
			throw ex;
		}
	}

	public void setDefaultContext() {
		ApiContext apiContext = new ApiContext();
		apiContext.setUserId(1);
		ThreadLocalWithApiContext.setUserIdentityContext(apiContext);
	}

}
