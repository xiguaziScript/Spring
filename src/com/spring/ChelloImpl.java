package com.spring;

public class ChelloImpl implements Hello {
    public String msg=""; 
	
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ChelloImpl() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public String DoSalutation() {
		// TODO 自动生成的方法存根
		return  "你好"+this.msg;
	}

}
