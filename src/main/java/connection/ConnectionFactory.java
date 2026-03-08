
package connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Jhon
 */
public class ConnectionFactory {

    //Dados da conexão
        private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
        private static final String URL =
            "jdbc:mysql://localhost:3306/estoque_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        private static final String USER = "root";
        private static final String PASSWORD = "";
    //Métodos
        
        public static Connection getConnection(){
            Connection con = null;
            
            try {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Banco de dados conectado.");
            } catch (Exception e) {
                System.out.println("Banco de dados não conectado");
                e.printStackTrace();
            }
            
            return con;
             
        }
}