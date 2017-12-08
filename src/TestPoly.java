/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TestPoly {

    public static void main(String[] args) {
        Employee staf = new Employee();
        staf.setNama("Doel");

        //satf.coding():
        Programmer nama = new Programmer();
        nama.setNama("Joel");
        nama.coding(); //--> dijadikan coding() di programmer
        
        Employee ee = new Programmer();
        Programmer aProgrammer = (Programmer) ee;//dicasting dr programmer ke employee
        aProgrammer.setNama("EE Einstein");
   //     aProgrammer.coding(); --> ga perlu pake lagi krn dia sudah jadi programmer

        System.out.println("Nama "+aProgrammer.getNama()+" Coding : "+aProgrammer.coding());
        //eee.coding(); -->Reference membatasi akses ke object



        Departement finance = new Departement();
        Employee bejo = new Employee("bejo");

        Person p = new Employee("siti");
        finance.fire(p);

        Programmer prog = new Developer();
        Person per = new Sales();
// Direktur dir = new Developer(); --> karena direktur gak punya keturunan
// Programmer pro = new Sales(); --> ga bisa karena sesama sepupu tidak bisa saling manggil
// Sekretaris sek = new Person(); --> subclass tidak bisa manggil superclass

        //reference   =  object
//        Person p   = new Programmer();
//        Person staf = new Programmer();
//        
//        new Sales (); // --> objek tanpa reference
        // TODO code application logic here
    }

}
