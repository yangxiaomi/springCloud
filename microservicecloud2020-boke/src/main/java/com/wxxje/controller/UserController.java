package com.wxxje.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.microservicecloud.api2020.entities.Consumer;
import com.wxxje.service.ConsumerService;

/**
 * @author 15824
 *
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
	@Autowired
	ConsumerService consumerService;
	
	/**
	 * 查询用户列表
	 */
	@RequestMapping("/selectUserPage")
	public IPage<Consumer> selectUserPage(Integer pageON ,String nickName){
		if(pageON ==null) {
			pageON = 1;
		}
		Page<Consumer> page = new Page<>();
		page.setCurrent(pageON);
		
		QueryWrapper<Consumer> queryWrapper = new QueryWrapper<>();
		if(nickName !=null) {
			queryWrapper.like("nickName", nickName);
		}
		return consumerService.selectList(page, queryWrapper);
	}
	
	
	/**
	 * 删除用户
	 */
	@RequestMapping("/deleteUser")
	public String deleteUser(Integer id) {
		int i= consumerService.deleteUser(id);
		if(i>0) {
			return "删除成功";
		}else {
			return "删除失败";
		}
	}
	
	/**
	 * 修改用户
	 */
	@RequestMapping("/updateUser")
	public String updateUser(Consumer consumer) {
		int i = consumerService.updateConsumer(consumer);
		if(i>0) {
			return "修改成功";
		}else {
			return "修改失败";
		}
	}
	
	/**
	 * 新增用户
	 */
	@RequestMapping("/addUser")
	public String addUser(Consumer consumer) {
		consumerService.insertDetp(consumer);
		return "新增成功";
	}
}
