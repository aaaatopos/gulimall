package com.xzt.gulimall.order.dao;

import com.xzt.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xzt
 * @email xzt2520@163.com
 * @date 2023-05-08 16:10:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
