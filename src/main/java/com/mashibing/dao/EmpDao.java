package com.mashibing.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mashibing.bean.Emp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpDao extends BaseMapper<Emp> {
}
