package xwy.MySpringMVC.demo.service.impl;

import xwy.MySpringMVC.annotitain.XwyAutowired;
import xwy.MySpringMVC.annotitain.XwyService;
import xwy.MySpringMVC.demo.service.INamedService;
import xwy.MySpringMVC.demo.service.IService;

@XwyService("myName")
public class NamedServiceImpl implements INamedService{

	@XwyAutowired IService service;
	
}
