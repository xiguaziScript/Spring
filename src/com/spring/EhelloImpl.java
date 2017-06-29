package com.spring;

public class EhelloImpl implements Hello {
	public String Msg="";

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public EhelloImpl() {
		// TODO 自动生成的构造函数存根
	}
	
	@Override
	public String DoSalutation() {
		// TODO 自动生成的方法存根
		return "Hello"+this.Msg;
	}

}
