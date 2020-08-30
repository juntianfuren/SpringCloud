package com.jtfr.event;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;
/**
 * 
 * UserRegisterEvent 需要继承  RemoteApplicationEvent
 * 
 * @author 陈康明
 * @since 2020年08月19日 14:57
 */
public class UserRegisterEvent extends RemoteApplicationEvent {

	private static final long serialVersionUID = 8475901761085898705L;
	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 创建一个空的构造方法，要序列化。为什么要有默认空的序列化才能构造方法。
	 */
	public UserRegisterEvent() {}

	public UserRegisterEvent(Object source, String originService, String destinationService, String username) {
		super(source, originService);
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

}