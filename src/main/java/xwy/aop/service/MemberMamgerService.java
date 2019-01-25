package xwy.aop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import xwy.aop.model.Member;

@Service
public class MemberMamgerService {
	
	private final static Logger LOG = Logger.getLogger(MemberMamgerService.class);
	
	public boolean add(Member member) {
		LOG.info("add user");
		return true;
	}
	
	public boolean remove(long id) throws Exception{
		LOG.info("remove user");
		throw new Exception("own exception");
	}
	
	public boolean modify(long id) throws Exception{
		LOG.info("modify user");
		return true;
	}
	
	public boolean query(long id) throws Exception{
		LOG.info("query user");
		return true;
	}
	

}
