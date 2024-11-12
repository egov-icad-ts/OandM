package com.tgs.ir.core;

/**
 * The Class ResponseJson.
 *
 * @param <S> the generic type
 * @param <T> the generic type
 */
public class BaseResponse<S, T> {
	
	private S status;
	private String message;
	private T data;
	private boolean success;
	private int total;
	
	public S getStatus() {
		return status;
	}
	public void setStatus(S status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
