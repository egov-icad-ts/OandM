package com.tgs.ir.user;

import com.tgs.ir.core.BaseController;
import com.tgs.ir.core.BaseResponse;
import com.tgs.ir.user.UserEntity;
import com.tgs.ir.user.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController extends BaseController<UserEntity, UserModel,Integer> {
    // Specific endpoints or overrides if necessary

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<HttpStatus, UserModel>> getById(@PathVariable Integer id) {
        BaseResponse<HttpStatus, UserModel> response = userService.get(id);
        return new ResponseEntity<>(response, response.getStatus());
        
      
    }
}
