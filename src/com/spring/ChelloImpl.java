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
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String DoSalutation() {
		// TODO �Զ����ɵķ������
		return  "���"+this.msg;
	}

}
