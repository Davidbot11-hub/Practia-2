package com.practica.dos.base.dataStruct.queque;

public class queque <E>{
    private quequeImplementation<E> queque;
    public queque(Integer top){
        queque = new quequeImplementation<>(top);
    }
    public Boolean queque(E data){
        try{
            queque.queque(data);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public E queque(){
        try{
            return queque.deQueque();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean isFullQueque(){
        return queque.isFullqueque();
    }

    public Integer top(){
        return queque.getTop();
    }

    public Integer size(){
        return queque.getLength();
    }
}

