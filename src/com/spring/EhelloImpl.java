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
		// TODO �Զ����ɵĹ��캯�����
	}
	
	@Override
	public String DoSalutation() {
		// TODO �Զ����ɵķ������
		return "Hello"+this.Msg;
	}

}
