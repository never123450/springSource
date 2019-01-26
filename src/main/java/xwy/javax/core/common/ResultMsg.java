package xwy.javax.core.common;

import java.io.Serializable;

//一般作为service返回
public class ResultMsg<T> implements Serializable {

	private static final long serialVersionUID = 2635002588308355785L;

	private int status;//状态码（每个系统都应该有自己的状态码常量）
	private String msg;//返回结果的文字说明
	private T data;//放返回的实际数据（可以放任何东西）

	public ResultMsg() {
	}
	
	public ResultMsg(int status) {
		this.status = status;	
	}

	public ResultMsg(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	public ResultMsg(int status, T data) {
		this.status = status;
		this.data = data;
	}

	public ResultMsg(int status, String msg, T data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
