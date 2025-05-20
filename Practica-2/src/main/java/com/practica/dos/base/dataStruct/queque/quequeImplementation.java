package com.practica.dos.base.dataStruct.queque;

import com.practica.dos.base.dataStruct.likedist;

public class quequeImplementation<E> extends likedist<E> {
    private Integer top;
    
    public Integer getTop() {
        return top;
    }

    public quequeImplementation(Integer top) {
        this.top = top;
    }
    
    protected Boolean isFullqueque(){
        return this.top >= getLength();
    }

    protected void queque(E info) throws Exception {
        if (isFullqueque()) {
            add(info, 0);
        }else {
            throw new ArrayIndexOutOfBoundsException("Queque is full");
        }
    }

    protected E deQueque() throws Exception {
        return deleteFirst();
    }
}
