import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTableCreate
{
    public static void main(String args[])
    {
        Connection con;
        String s;
        Statement st;
        try
        {
           Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root369");
            st=con.createStatement();
            s="create table Student(rno int,sname varchar(40)not null,per float check(per>0)not null)";
            st.executeUpdate(s);
            System.out.println("Table created Successfully!!!");
            con.close();
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }

    }
}
