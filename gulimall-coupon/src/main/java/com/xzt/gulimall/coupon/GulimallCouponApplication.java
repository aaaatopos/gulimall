package com.xzt.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 如何使用nacos作为配置中心统一管理配置
 * 1.引入依赖 nacos-config
 * 2.创建 bootstrap.properties  --- 现在的版本需要引入bootstrap依赖
 * 3.需要给配置中心默认添加一个叫 数据集（Data Id） - 当前应用名.properties（例如：gulimall-coupon.properties）
 * 4.给 应用名.properties 添加任何配置
 * 5.动态获取配置
 *   @RefreshScop 动态获取并刷新配置
 *   @Value("${配置项的名}") 获取到的配置
 * 6.如果配置中心和当前应用的配置文件都配置了相同的项，则优先使用配置中心配置的项。
 *
 * 二、细节
 * 1、明明空间：配置隔离
 *  默认：public（保留空间）默认新增的所有配置都在public空间
 *  开发，测试，生产：利用命名空间来做环境隔离
 *      注意：需要再BootStrap.properties中配置上需要使用那个命名空间。
 *   每一个微服务之间互相隔离，每一个微服务都创建一个命名空间，只加载自己命名空间下的配置
 * 2、配置集：所有的配置集合
 * 3、配置集ID：类似文件名
 *     DataID
 * 4、配置分组：
 *      默认所有的配置集都属于：DEFAULT_GROUP
 * 每个微服务创建自己的命名空间，使用配置分组进行分组
 */
@MapperScan("com.xzt.gulimall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
