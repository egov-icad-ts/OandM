package com.tgs.ir.user;

import com.tgs.ir.core.BaseRepository;
import com.tgs.ir.user.UserEntity;

public interface UserRepository extends BaseRepository<UserEntity, Integer> {


    UserEntity findByEmail(String email);
    UserEntity findByUuId(String uuid);
}
