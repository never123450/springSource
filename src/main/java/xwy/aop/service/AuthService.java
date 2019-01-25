package xwy.aop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import xwy.aop.model.Member;

@Service
public class AuthService {
	
	private final static Logger LOG = Logger.getLogger(AuthService.class);
	
	public Member login(String loginName,String loginPass) {
		LOG.info("用户登录");
		return null;
	}
	
	public boolean logout(String loginName) {
		LOG.info("注销登录");
		return true;
	}

}
