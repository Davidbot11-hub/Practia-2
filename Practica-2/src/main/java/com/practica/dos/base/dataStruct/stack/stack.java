package com.practica.dos.base.dataStruct.stack;

public class stack <E>{
   private stackImplementation<E> stack;

    public stack(Integer top){
        stack = new stackImplementation<>(top);

    }

    public Boolean push(E data){
        try {
            stack.push(data);
            return true;
        } catch (Exception e) {
            return false;
            // TODO: handle exception
        }
    }

    public E pop() {
        try {
            return stack.pop();
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    public Boolean isFullStack(){
        return stack.isFull();
    }

    public Integer top(){
        return stack.getTop();
    }

    public Integer size(){
        return stack.getLength();
    }
    
}
