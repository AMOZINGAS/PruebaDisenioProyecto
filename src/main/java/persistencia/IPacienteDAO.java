/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import DTOS.PacienteGeneradoDTO;
import DTOS.PacienteNuevoDTO;

/**
 *
 * @author PC
 */
public interface IPacienteDAO {
    
    public PacienteGeneradoDTO guardarPaciente(PacienteNuevoDTO pacienteNuevoDTO);
    
    public PacienteGeneradoDTO buscarPacientePorId(int id);
    
    public PacienteGeneradoDTO actualizarPaciente(PacienteGeneradoDTO pacienteGeneradoDTO);
    
    public PacienteGeneradoDTO eliminarPaciente(PacienteGeneradoDTO pacienteGeneradoDTO);
    
}
