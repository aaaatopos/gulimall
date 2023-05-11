package com.xzt.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzt.common.utils.PageUtils;
import com.xzt.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xzt
 * @email xzt2520@163.com
 * @date 2023-05-08 16:10:05
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

