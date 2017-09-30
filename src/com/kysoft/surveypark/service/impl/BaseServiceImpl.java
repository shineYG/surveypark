package com.kysoft.surveypark.service.impl;

import com.kysoft.surveypark.service.BaseService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 下午1:42
 * To change this template use File | Settings | File Templates.
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Override
    public void saveEntity(T t) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void saveOrUpdateEntity(T t) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateEntity(T t) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteEntity(T t) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void batchEntityByHql(String hql, Object... args) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T loadEntity(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T getEntity(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<T> findEntityByHql(String hql, Object... args) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
