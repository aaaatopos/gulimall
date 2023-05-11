package com.xzt.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzt.common.utils.PageUtils;
import com.xzt.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author xzt
 * @email xzt2520@163.com
 * @date 2023-05-08 15:58:24
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

