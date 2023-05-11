package com.xzt.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzt.common.utils.PageUtils;
import com.xzt.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author xzt
 * @email xzt2520@163.com
 * @date 2023-05-08 16:03:58
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

