package com.xzt.gulimall.member.feign;

import com.xzt.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xzt
 * @version 1.0
 * 这是一个声明式的远程调用
 */
@FeignClient("gulimall-coupon")  // 调用gulimall-coupon远程服务
public interface CouponFeignService {

    // 将远程调用的方法
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
