package com.kysoft.surveypark.dao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 上午11:07
 * To change this template use File | Settings | File Templates.
 */
public interface BaseDao<T> {
    //写操作
    public void saveEntity(T t);
    public void saveOrUpdateEntity(T t);
    public void updateEntity(T t);
    public void deleteEntity(T t);
    public void batchEntityByHql(String hql, Object...args);

    //读操作
    public T loadEntity(Integer id);
    public T getEntity(Integer id);
    public List<T> findEntityByHql(String hql, Object...args);
}
