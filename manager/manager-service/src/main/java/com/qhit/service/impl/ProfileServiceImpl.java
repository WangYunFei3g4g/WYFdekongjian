package com.qhit.service.impl;

import com.qhit.mapper.ProfileMapper;
import com.qhit.pojo.Profile;
import com.qhit.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileMapper profileMapperimpl;

    @Override
    public List<Profile> getAll() {
        return profileMapperimpl.getAll();
    }

    @Override
    public Profile getNameById(int id) {
        return profileMapperimpl.getNameById(id);
    }

    @Override
    public int add(Profile pro) {
        return profileMapperimpl.add(pro);
    }

    @Override
    public int update(Profile pro) {
        return profileMapperimpl.update(pro);
    }

    @Override
    public int del(int id) {
        return profileMapperimpl.del(id);
    }
}



