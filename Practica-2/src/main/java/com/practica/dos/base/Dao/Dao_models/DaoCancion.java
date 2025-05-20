package com.practica.dos.base.Dao.Dao_models;

import com.practica.dos.base.models.TipoArchivoEnum;
import com.practica.dos.base.models.cancion;
import com.practica.dos.base.Dao.AdapterDao;
import com.practica.dos.base.dataStruct.likedist;


public class DaoCancion extends AdapterDao<cancion> {
    private cancion obj;
    private likedist<cancion> aux;

    public DaoCancion() {
        super(cancion.class);
        // TODO Auto-generated constructor stub
    }

    // getter and setter
    public cancion getObj() {
        if (obj == null) {
            this.obj = new cancion();

        }
        return this.obj;
    }

    public void setObj(cancion obj) {
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

    public likedist<cancion> getlistAll() {
        if (aux == null) {
            this.aux = listAll();
        }
        return aux;
    }

   public static void main(String[] args) {
        DaoCancion da = new DaoCancion();
        da.getObj().setId(da.listAll().getLength() + 1);
        da.getObj().setNombre("The sound of silence 15");
        da.getObj().setDuracion(250);
        da.getObj().setUrl("www.google.com");
        da.getObj().setTipo(TipoArchivoEnum.VIRTUAL);
        da.getObj().setIdAlbum(1);
        da.getObj().setId_genero(1);        
        if(da.save()){
            System.out.println("Se guardo correctamente");
        } else {
            System.out.println("Error al guardar");
        }
        System.out.println("NUMERO EN LISTA: " +da.getlistAll().getLength());
    } 
}