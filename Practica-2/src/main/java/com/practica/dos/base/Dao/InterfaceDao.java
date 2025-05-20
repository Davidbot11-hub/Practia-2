package com.practica.dos.base.Dao;

import com.practica.dos.base.dataStruct.likedist;

public interface InterfaceDao <T> {
    
    public likedist<T> listAll();
    public void persist(T obj) throws Exception;
    public void update(T obj, Integer pos) throws Exception;
    public void update_by_id(T obj, Integer id) throws Exception;
    public T get(Integer id) throws Exception;

}
