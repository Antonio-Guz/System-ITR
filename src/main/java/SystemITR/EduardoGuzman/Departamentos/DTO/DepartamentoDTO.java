package SystemITR.EduardoGuzman.Departamentos.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class DepartamentoDTO {

    private Long id;

     @NotBlank (message = "El nombre del departamento es obligatorio ")
     @Size (max = 50, min = 5, message = "El nombre del departamento debe de ser mayor  a 50")
    private String nombreDepto;
     @Size(max = 5, message = "Error al crear la abreviación, 5 caracteres máximo")
     private String abreviacion;
    private String ubicacion;


}
