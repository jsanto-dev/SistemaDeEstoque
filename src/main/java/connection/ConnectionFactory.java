
package connection;

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
        private static final String PASSWORD = "cimatec";
    //Métodos
        
        public static connection getConnection(){
            connection con = null;
            
            try {
                class.forName(DRIVER);
                con = DriverManeger.getconnection(URL, USER, PASSWORD);
                System.out.println("Banco de dados conectado.");
            } catch (Exception e) {
                System.out.println("Banco de dados não conectado");
                e.printStackTrace();
            }
            
            return con;
             
        }
}