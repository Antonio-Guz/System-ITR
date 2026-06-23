package SystemITR.EduardoGuzman.Departamentos.Controller;

import SystemITR.EduardoGuzman.Departamentos.DTO.DepartamentoDTO;
import SystemITR.EduardoGuzman.Response.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/empleados")
public class DepartamentoController {

    @PostMapping
    public ResponseEntity<ApiResponse<DepartamentoDTO>> nuevoDepartamento (@Valid @RequestBody DepartamentoDTO json){
        ApiResponse<DepartamentoDTO>response = new ApiResponse<>(true,"Proceso completado",json);
        return ResponseEntity.ok(response);
    }
}
