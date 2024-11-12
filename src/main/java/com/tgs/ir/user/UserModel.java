package com.tgs.ir.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class UserModel {

	private String uuId;

	private Integer id;

	private String email;

	private String password;

	private String name;

	private boolean active;

	private Integer userId;

}
