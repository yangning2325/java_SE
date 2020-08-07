package io.objectstream;

import java.io.Serializable;

//要想序列化必须实现Serializable这个接口

public class User implements Serializable { 
	static final long serialVersionUID=12345678111l; //手动添加序列化版本号防止系统自动生成
	transient String name; //不参加序列化
	
	public String toString() {
		return "User [哈哈哈]";
	}
	
}
