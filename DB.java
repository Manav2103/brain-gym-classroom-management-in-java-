import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
public class DB{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Root@1234");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from Student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}

public static Connection getConnection() {
// TODO Auto-generated method stub
try {
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Root@1234");
return con;
}catch(Exception e) {return null;}

}  
}  