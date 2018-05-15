package com.xubh.springcloud.service;

import java.util.List;

import com.xubh.springcloud.entities.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
