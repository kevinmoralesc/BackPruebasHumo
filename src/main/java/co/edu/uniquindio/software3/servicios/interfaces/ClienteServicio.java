package co.edu.uniquindio.software3.servicios.interfaces;

import co.edu.uniquindio.software3.dto.ClienteDTO;
import co.edu.uniquindio.software3.dto.CredentialsDTO;
import co.edu.uniquindio.software3.dto.SignUpDTO;

public interface ClienteServicio {
    ClienteDTO login(CredentialsDTO credentialsDto);
    ClienteDTO register(SignUpDTO clienteDTO);
    ClienteDTO findByEmail(String login);

    ClienteDTO findById(String id);
}
