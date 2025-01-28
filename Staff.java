package com; 
 
public class Staff extends Person { 
    private String staffId; 
 
    public Staff(String id, String name, String staffId) { 
        super(id, name); 
        this.staffId = staffId; 
    } 
 
    public String getStaffId() { 
        return staffId; 
    } 
 
    public void setStaffId(String staffId) { 
        this.staffId = staffId; 
    } 
}
