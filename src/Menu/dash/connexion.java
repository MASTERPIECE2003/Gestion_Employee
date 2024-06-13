
package Menu.dash;
import java.sql.*;

/**
 *
 * @author Japhar
 */
public class connexion {
     String urlPilote= "org.postgresql.Driver";
     String urlBaseDonne;
Connection con;
   public connexion (){  
        this.urlBaseDonne = "jdbc:postgresql://localhost:5432/employee_gestion";
try
    {Class.forName(urlPilote);
        System.out.println("chargement pilote reussi");
    }

    catch(ClassNotFoundException ex){ System.out.println(ex);

}

try { 
    con=DriverManager.getConnection(urlBaseDonne,"postgres","root");
    System.out.println("chargement base donne reussi");
}
catch(SQLException ex){ System.out.println(ex);
}

}
Connection obtenir(){
return con;
}
    
 
    
}
