package cn.itcast.takeout.bean;

public class Response {
	//服务器开发者定义的数据结构
	private String code;
	private String data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}	
}
