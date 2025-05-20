package com.practica.dos.base.Dao.Dao_models;

import com.practica.dos.base.Dao.AdapterDao;
import com.practica.dos.base.dataStruct.likedist;
import com.practica.dos.base.models.genero;

public class DaoGenero extends AdapterDao<genero> {
    private genero obj;

    private likedist<genero> aux;
    public DaoGenero() {
        super(genero.class);
        // TODO Auto-generated constructor stub
    }

    // getter and setter
    public genero getObj() {
        if (obj == null) {
            this.obj = new genero();

        }
        return this.obj;
    }

    public void setObj(genero obj) {
        this.obj = obj;
    }

    public Boolean save() {
        try {
            obj.setId(listAll().getLength()+1);
            this.persist(obj);
            return true;
        } catch (Exception e) {
            
            return false;
            // TODO: handle exception
        }
    }

    public Boolean update(Integer pos) {
        try {
            this.update(obj, pos);
            return true;
        } catch (Exception e) {
            
            return false;
            // TODO: handle exception
        }
    }

    public likedist<genero> getlistAll() {
        if (aux == null) {
            this.aux = listAll();
        }
        return aux;
    }

    public static void main(String[] args) {
        DaoGenero da = new DaoGenero();
        da.getObj().setId(1);
        da.getObj().setNombre("Cumbia");
        if (da.save()) {
            System.out.println("Guardado");
        } else {
            System.out.println("Error al guardar");
        }       
    }
}
