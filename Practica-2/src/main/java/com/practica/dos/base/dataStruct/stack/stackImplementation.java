package com.practica.dos.base.dataStruct.stack;

import com.practica.dos.base.dataStruct.likedist;

public class stackImplementation<E> extends likedist<E> {
   private Integer top;

    //getter 
    public Integer getTop() {
        return top;
    }
    
    public stackImplementation(Integer top) {
       
        this.top = top;
    }

    protected boolean isFull() {
        return getLength() > this.top;
    }

    protected void push(E info) throws Exception {
        if (!isFull()) {
            add( info, 0);
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
    }

    protected E pop()throws Exception {
        return deleteFirst(); 
    }
}
