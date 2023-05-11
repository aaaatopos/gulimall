package com.xzt.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzt.common.utils.PageUtils;
import com.xzt.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author xzt
 * @email xzt2520@163.com
 * @date 2023-05-08 16:12:16
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

