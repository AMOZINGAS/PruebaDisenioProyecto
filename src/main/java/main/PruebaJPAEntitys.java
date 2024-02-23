/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import presentacion.JFrameGenerarPaciente;


/**
 *
 * @author PC
 */
public class PruebaJPAEntitys {

    public static void main(String[] args) {
        
        JFrameGenerarPaciente generar = new JFrameGenerarPaciente();
        generar.setVisible(true);
        
    }
}
        
        
        //Creamos un factory de EntityManagers

        
        //Creamos un objeto EntityManager querepresente a nuestra base de datos en codigo
        
        
//        entityManager.getTransaction().begin();
//        
//        JuegosEntity juegos = new JuegosEntity("Warner Brothers", "Mortal Kombat 1");
//        
//        TrofeosEntity trofeo1 = new TrofeosEntity("Primer FATALITY", 1000, juegos);
//        TrofeosEntity trofeo2 = new TrofeosEntity("10 Fatalitys", 10000, juegos);
//
//        List<TrofeosEntity> listaTrofeos = new ArrayList();
//        listaTrofeos.add(trofeo1);
//        listaTrofeos.add(trofeo2);
//        
//        juegos.setListaTrofeos(listaTrofeos);
//        
//        entityManager.persist(juegos);
//        
//        
//        entityManager.getTransaction().commit();
//        
//        entityManager.close();

       
        
        //Iniciamos una transaccion
//        entityManager.getTransaction().begin();
//        
//        //todo el codigo aqui
//            
//            
//        //CRUD
//            //Create
//            //Creamos una instancia de nuestra entidad tabla
//            ClientesEntidad cliente1;
//            
//            //Como cualquier otro objeto, llenamos los campos necesarios para su creacion
//            Date fechaNacimiento = new Date(1982-1900, 12-1, 28);
//            cliente1 = new ClientesEntidad("6442-62-11-69", "OUQA040309QF7", fechaNacimiento, "OUQA040309HSRLRMA5", nombres, apellidoPaterno, apellidoMaterno, calle, colonia, codigoPostal);
//            
//            //Finalmente seteamos y generamos un cliente
//            entityManager.persist(cliente1);
//            
//            //Validamos que el objeto se creo correctamente
//            if(cliente1 == null){
//                
//                //Hacemos rollback si no se creo de manera correcta el cliente
//                entityManager.getTransaction().rollback();
//                
//            }else{
//                
//                //mandamos a ejecutar la transaccion si todo salió bien
//                entityManager.getTransaction().commit();
//                
//            }
//        
//        //cerramos todo
//        entityManager.close();