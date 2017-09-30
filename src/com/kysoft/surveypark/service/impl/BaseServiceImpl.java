package com.kysoft.surveypark.service.impl;

import com.kysoft.surveypark.dao.BaseDao;
import com.kysoft.surveypark.service.BaseService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 下午1:42
 * To change this template use File | Settings | File Templates.
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDao dao;

    @Resource
    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    @Override
    public void saveEntity(T t) {
        dao.saveEntity(t);
    }

    @Override
    public void saveOrUpdateEntity(T t) {
        dao.saveOrUpdateEntity(t);
    }

    @Override
    public void updateEntity(T t) {
        dao.updateEntity(t);
    }

    @Override
    public void deleteEntity(T t) {
        dao.deleteEntity(t);
    }

    @Override
    public void batchEntityByHql(String hql, Object... args) {
        dao.batchEntityByHql(hql, args);
    }

    @Override
    public T loadEntity(Integer id) {
        return (T) dao.loadEntity(id);
    }

    @Override
    public T getEntity(Integer id) {
        return (T) dao.getEntity(id);
    }

    @Override
    public List<T> findEntityByHql(String hql, Object... args) {
        return dao.findEntityByHql(hql, args);
    }
}
