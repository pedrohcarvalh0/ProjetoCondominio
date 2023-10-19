package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author tapet
 */
public class ConnectionBD {
    
    // Vamos ter que mudar
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgreesql.Driver";
    
    //EXEMPLO DO BANCO LOCAL, PRECISAMOS ALTERAR PARA TER UM BANCO ONLINE 
    //(OU PERGUNTAR A RICARDO SE É REALMENTE PRECISO)
    private String local = "jdbc:postegresql://localhost:5432/NOMEDOBANCO";   
    
    private String user = "postegres";
    private String password = "postegres";
    public Connection con;
    
    public void Conexao () {
        
    }
    
}
