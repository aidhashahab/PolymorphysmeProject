/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Programmer extends Employee {
    private Employee nama;
    
    public boolean coding(){

        System.out.println("lagi ngoding "+getNama());
        return true;
        
    }

    /**
     * @return the nama
     */

    /**
     * @param nama the nama to set
     */
    public void setNama(Employee nama) {
        this.nama = nama;
    }
    
}
