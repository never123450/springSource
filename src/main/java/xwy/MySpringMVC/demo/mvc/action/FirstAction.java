package xwy.MySpringMVC.demo.mvc.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xwy.MySpringMVC.annotitain.XwyAutowired;
import xwy.MySpringMVC.annotitain.XwyController;
import xwy.MySpringMVC.annotitain.XwyRequestMapping;
import xwy.MySpringMVC.annotitain.XwyRequestParam;
import xwy.MySpringMVC.demo.service.INamedService;
import xwy.MySpringMVC.demo.service.IService;
import xwy.MySpringMVC.servlet.XwyModelAndView;

@XwyController
@XwyRequestMapping("/web")
public class FirstAction {

	@XwyAutowired private IService service;
	
	@XwyAutowired("myName") private INamedService namedService;
	
	
	@XwyRequestMapping("/query/.*.json")
//	@XwyResponseBody
	public XwyModelAndView query(HttpServletRequest request,HttpServletResponse response, 
			@XwyRequestParam(value="name",required=false) String name,
			@XwyRequestParam("addr") String addr){
		//out(response,"get params name = " + name);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("name", name);
		model.put("addr", addr);
		return new XwyModelAndView("first.pgml",model);
	}
	
	
	@XwyRequestMapping("/add.json")
	public XwyModelAndView add(HttpServletRequest request,HttpServletResponse response){
		out(response,"this is json string");
		return null;
	}
	
	
	
	public void out(HttpServletResponse response,String str){
		try {
			response.getWriter().write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
