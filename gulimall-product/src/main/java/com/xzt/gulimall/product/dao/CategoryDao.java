package com.xzt.gulimall.product.dao;

import com.xzt.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xzt
 * @email xzt2520@163.com
 * @date 2023-05-08 15:33:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
