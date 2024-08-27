package ra.service;

import ra.exception.CustomException;
import ra.model.dto.request.FormLogin;
import ra.model.dto.request.FormRegister;
import ra.model.dto.response.JwtResponse;

public interface IAuthService {
    void register(FormRegister formRegister) throws CustomException;
    JwtResponse login(FormLogin formLogin) throws CustomException;
}
