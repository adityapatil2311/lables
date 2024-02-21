package com.org.lablesproject.payload;

import java.util.List;

import org.springframework.data.domain.Page;

public class ApiResponse<T> {

	private T data;
	private List<T> dataList;
	private Page<T> dataPage;
	private String message;
	public ApiResponse(T data, List<T> dataList, Page<T> dataPage, String message) {
		super();
		this.data = data;
		this.dataList = dataList;
		this.dataPage = dataPage;
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public List<T> getDataList() {
		return dataList;
	}
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	public Page<T> getDataPage() {
		return dataPage;
	}
	public void setDataPage(Page<T> dataPage) {
		this.dataPage = dataPage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
