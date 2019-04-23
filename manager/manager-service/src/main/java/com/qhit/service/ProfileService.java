package com.qhit.service;

import com.qhit.pojo.Profile;

import java.util.List;

public interface ProfileService {
    //    查询全部
    List<Profile> getAll();

    //    根据id查询
    Profile getNameById(int id);

    //   新增
    int add(Profile pro);

    //    修改
    int update(Profile pro);

    //    删除
    int del(int id);
}
