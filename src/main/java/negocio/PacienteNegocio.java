/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DTOS.PacienteGeneradoDTO;
import DTOS.PacienteNuevoDTO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencia.PacienteDAO;
import persistencia.IPacienteDAO;

/**
 *
 * @author Laboratorios
 */
public class PacienteNegocio {
    
    private IPacienteDAO pacienteDAO;
    private PacienteNuevoDTO pacienteNuevoDTO;
    
    public PacienteNegocio(){
        
    }
    
    public PacienteNegocio(PacienteNuevoDTO pacienteNuevoDTO){
        
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("persistencia");
        
        EntityManager entityManager = managerFactory.createEntityManager();
        this.pacienteDAO = new PacienteDAO(entityManager);
        this.pacienteNuevoDTO = pacienteNuevoDTO;
        
    }
    
    public PacienteGeneradoDTO enviarCliente(PacienteNuevoDTO pacienteNuevoDTO){
        
        PacienteGeneradoDTO pacienteGeneradoDTO = pacienteDAO.guardarPaciente(pacienteNuevoDTO);
        return pacienteGeneradoDTO;
            
    }
    
}
