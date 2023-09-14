package com.miyuki.learn.design.dao;


import com.miyuki.learn.design.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);

}
