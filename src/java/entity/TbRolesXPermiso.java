package entity;
// Generated 25/04/2014 10:50:16 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * TbRolesXPermiso generated by hbm2java
 */
public class TbRolesXPermiso  implements java.io.Serializable {


     private int ropCod;
     private TbRoles tbRoles;
     private TbPermiso tbPermiso;
     private String ropUserInsert;
     private String ropUserUpdate;
     private Date ropFechaInsert;
     private Date ropFechaUpdate;

    public TbRolesXPermiso() {
    }

    public TbRolesXPermiso(int ropCod, TbRoles tbRoles, TbPermiso tbPermiso, String ropUserInsert, String ropUserUpdate, Date ropFechaInsert, Date ropFechaUpdate) {
       this.ropCod = ropCod;
       this.tbRoles = tbRoles;
       this.tbPermiso = tbPermiso;
       this.ropUserInsert = ropUserInsert;
       this.ropUserUpdate = ropUserUpdate;
       this.ropFechaInsert = ropFechaInsert;
       this.ropFechaUpdate = ropFechaUpdate;
    }
   
    public int getRopCod() {
        return this.ropCod;
    }
    
    public void setRopCod(int ropCod) {
        this.ropCod = ropCod;
    }
    public TbRoles getTbRoles() {
        return this.tbRoles;
    }
    
    public void setTbRoles(TbRoles tbRoles) {
        this.tbRoles = tbRoles;
    }
    public TbPermiso getTbPermiso() {
        return this.tbPermiso;
    }
    
    public void setTbPermiso(TbPermiso tbPermiso) {
        this.tbPermiso = tbPermiso;
    }
    public String getRopUserInsert() {
        return this.ropUserInsert;
    }
    
    public void setRopUserInsert(String ropUserInsert) {
        this.ropUserInsert = ropUserInsert;
    }
    public String getRopUserUpdate() {
        return this.ropUserUpdate;
    }
    
    public void setRopUserUpdate(String ropUserUpdate) {
        this.ropUserUpdate = ropUserUpdate;
    }
    public Date getRopFechaInsert() {
        return this.ropFechaInsert;
    }
    
    public void setRopFechaInsert(Date ropFechaInsert) {
        this.ropFechaInsert = ropFechaInsert;
    }
    public Date getRopFechaUpdate() {
        return this.ropFechaUpdate;
    }
    
    public void setRopFechaUpdate(Date ropFechaUpdate) {
        this.ropFechaUpdate = ropFechaUpdate;
    }




}

