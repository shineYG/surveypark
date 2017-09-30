package com.kysoft.surveypark.dao.impl;

import com.kysoft.surveypark.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 上午11:16
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T>{

    private Class clazz;

    public BaseDaoImpl(){
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class) type.getActualTypeArguments()[0];
    }

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public void saveEntity(T t) {
        sessionFactory.getCurrentSession().save(t);
    }

    @Override
    public void saveOrUpdateEntity(T t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
    }

    @Override
    public void updateEntity(T t) {
        sessionFactory.getCurrentSession().update(t);
    }

    @Override
    public void deleteEntity(T t) {
        sessionFactory.getCurrentSession().delete(t);
    }

    @Override
    public void batchEntityByHql(String hql, Object... args) {
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        for(int i=0; i< args.length; i++){
            query.setParameter(i, args[i]);
        }
        query.executeUpdate();
    }

    @Override
    public T loadEntity(Integer id) {
        return (T) sessionFactory.getCurrentSession().load(clazz, id);
    }

    @Override
    public T getEntity(Integer id) {
        return (T) sessionFactory.getCurrentSession().load(clazz, id);
    }

    @Override
    public List<T> findEntityByHql(String hql, Object... args) {
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        for(int i=0; i< args.length; i++){
            query.setParameter(i, args[i]);
        }
        return query.list();
    }
}
