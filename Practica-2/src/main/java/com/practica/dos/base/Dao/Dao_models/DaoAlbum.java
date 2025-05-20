package com.practica.dos.base.Dao.Dao_models;

import java.util.Date;

import com.practica.dos.base.Dao.AdapterDao;
import com.practica.dos.base.dataStruct.likedist;
import com.practica.dos.base.models.album;


public class DaoAlbum  extends AdapterDao<album>{
    private album obj;
        private likedist<album> aux;

    public DaoAlbum() {
        super(album.class);
        // TODO Auto-generated constructor stub
    }

    // getter and setter
    public album getObj() {
        if (obj == null) {
            this.obj = new album();

        }
        return this.obj;
    }

    public void setObj(album obj) {
        this.obj = obj;
    }

    public Boolean save() {
        try {
            obj.setId(this.listAll().getLength() + 1);
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

    public likedist<album> getlistAll() {
        if (aux == null) {
            this.aux = listAll();
        }
        return aux;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DaoAlbum da = new DaoAlbum();
        da.getObj().setNombre("CAS");
        da.getObj().setId( 1);
        da.getObj().setFecha(new Date());

        da.getObj().setId_banda(87);//java.sql.Date.valueOf("2023-10-10")

        
        if(da.save()){
            System.out.println("Se guardo correctamente");
        } else {
            System.out.println("Error al guardar");
        }

    }
}
