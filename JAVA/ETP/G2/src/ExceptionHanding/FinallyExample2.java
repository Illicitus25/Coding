package ExceptionHanding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyExample2 {
    public static void main(String[] arg){
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection("","admin","password");
            //Queries
        }catch (SQLException e ){
            System.out.println("Error : " + e.getMessage());
        }finally {
            try {
                if(connection!=null){
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println("Error : Failed to close the connection" +
                        "");
            }
        }
    }
}
