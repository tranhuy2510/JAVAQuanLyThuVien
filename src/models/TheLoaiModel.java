/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ADMIN
 */
public class TheLoaiModel {
    
    private int id;
    private String name;
    
    // constractors
    public TheLoaiModel(){};
    
    public TheLoaiModel(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    // getters va setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public void setName(String _name) {
        this.name = _name;
    }
}
