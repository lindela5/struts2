package com.mkyong.user.action;

import com.mkyong.user.bo.UserBo;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

//@Namespace("/")
//@Action(value="userSpring")
//@Result(name = "success", location = "pages/user.jsp")
public class UserSpringAction {

//	//DI via Spring
//	UserBo userBo;
//
//	public UserBo getUserBo() {
//		return userBo;
//	}
//
//	public void setUserBo(UserBo userBo) {
//		this.userBo = userBo;
//	}

	public String execute() throws Exception {
		
//		userBo.printUser();
		
		return "success";
		
	}
}