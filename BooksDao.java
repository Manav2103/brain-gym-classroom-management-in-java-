import java.sql.Connection;
import java.sql.PreparedStatement;

public class BooksDao {
public static int save(String name,String author){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(name,author) values(?,?)");
		
		ps.setString(2,name);
		ps.setString(3,author);
		
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
