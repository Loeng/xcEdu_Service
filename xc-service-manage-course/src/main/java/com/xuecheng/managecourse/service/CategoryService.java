package com.xuecheng.managecourse.service;

import com.xuecheng.framework.domain.course.ext.CategoryNode;

import java.util.List;

/**
 * @Author: 98050
 * @Time: 2019-04-08 16:32
 * @Feature:
 */
public interface CategoryService {

    /**
     * 查询所有课程分类
     * @return
     */
    List<CategoryNode> findCourseCategoryList();
}
