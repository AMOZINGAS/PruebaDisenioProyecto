/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import DTOS.PacienteGeneradoDTO;
import DTOS.PacienteNuevoDTO;
import entidades.PacientesEntidad;
import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author PC
 */
public class PacienteDAO implements IPacienteDAO{

    private final EntityManager entityManager;
    
    public PacienteDAO(EntityManager entityManager){
        
        this.entityManager = entityManager;
        
    }
    
    @Override
    public PacienteGeneradoDTO guardarPaciente(PacienteNuevoDTO pacienteNuevoDTO) {
        
        EntityTransaction transaction = null;
            
        try{
        //CRUD
        
            transaction = entityManager.getTransaction();
            transaction.begin();
            //Create
            //Creamos una instancia de nuestra entidad tabla
            PacientesEntidad cliente1;

            //Como cualquier otro objeto, llenamos los campos necesarios para su creacion

            cliente1 = new PacientesEntidad( pacienteNuevoDTO.getTelefono(), 
                                            pacienteNuevoDTO.getNumeroSeguroSocial(), 
                                            pacienteNuevoDTO.getFechaNacimiento(), 
                                            pacienteNuevoDTO.getCurp(), pacienteNuevoDTO.getNombres(), 
                                            pacienteNuevoDTO.getApellidoPaterno(), 
                                            pacienteNuevoDTO.getApellidoMaterno(), 
                                            pacienteNuevoDTO.getCalle(), 
                                            pacienteNuevoDTO.getColonia(), 
                                            pacienteNuevoDTO.getCodigoPostal());
            
            entityManager.persist(cliente1);

            PacienteGeneradoDTO pacienteGeneradoDTO = new PacienteGeneradoDTO();
            pacienteGeneradoDTO.setId(cliente1.getId());
            pacienteGeneradoDTO.setEdad(cliente1.getEdad());
            pacienteGeneradoDTO.setNombres(pacienteNuevoDTO.getNombres());
            pacienteGeneradoDTO.setApellidoPaterno(pacienteNuevoDTO.getApellidoPaterno());
            pacienteGeneradoDTO.setApellidoMaterno(pacienteNuevoDTO.getApellidoMaterno());
            pacienteGeneradoDTO.setCalle(pacienteNuevoDTO.getCalle());
            pacienteGeneradoDTO.setColonia(pacienteNuevoDTO.getColonia());
            pacienteGeneradoDTO.setCodigoPostal(pacienteNuevoDTO.getCodigoPostal());
            pacienteGeneradoDTO.setCurp(pacienteNuevoDTO.getCurp());
            pacienteGeneradoDTO.setTelefono(pacienteNuevoDTO.getTelefono());
            pacienteGeneradoDTO.setNumeroSeguroSocial(pacienteNuevoDTO.getNumeroSeguroSocial());
            pacienteGeneradoDTO.setFechaNacimiento(pacienteNuevoDTO.getFechaNacimiento());
            //mandamos a ejecutar la transaccion si todo salió bien
            transaction.commit();

            System.out.println(pacienteGeneradoDTO.toString());

            return pacienteGeneradoDTO;

        }catch (Exception e) {
            System.out.println(e);

            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }

            return null;

        }
        
    }

    @Override
    public PacienteGeneradoDTO buscarPacientePorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PacienteGeneradoDTO actualizarPaciente(PacienteGeneradoDTO clienteGeneradoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PacienteGeneradoDTO eliminarPaciente(PacienteGeneradoDTO clienteGeneradoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
