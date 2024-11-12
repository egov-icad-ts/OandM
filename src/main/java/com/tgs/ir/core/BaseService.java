package com.tgs.ir.core;

import com.tgs.ir.requests.PaginationRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;

 import java.util.List;


public interface BaseService<M, T> {
	BaseResponse<HttpStatus, List<M>> get();
	BaseResponse<HttpStatus, List<M>> get(PaginationRequest pagination);
	BaseResponse<HttpStatus, M> get(T id);

	BaseResponse<HttpStatus, List<M>> get(List<T> ids);
	BaseResponse<HttpStatus, M> create(M model);
	BaseResponse<HttpStatus, M> update(T id, M model);
	BaseResponse<HttpStatus, M> delete(T id);	
	BaseResponse<HttpStatus, List<M>> delete(List<T> ids);
	BaseResponse<HttpStatus, List<M>> saveAll(List<M> models);
}
