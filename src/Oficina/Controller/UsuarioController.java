
package Oficina.Controller;

public class UsuarioController {
    
    public static boolean CadastrarUsuario(String Nome, String Email, String Senha, String Telefone, String Cpf, String Rg){
        
        if(Nome.length() > 0 && Email.length() > 0 && Senha.length() > 0 && Telefone.length() > 0 && Cpf.length() > 0 && Rg.length() > 0){
            return true;
        }else{
            return false;
        }
    }
}
