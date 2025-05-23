package mysql_select;
import java.sql.*;
import java.util.Properties;
public class mysql_select
{
public static void main(String[] args)
{
try
{
Connection dbConnection = null;
try
{ String url = "jdbc:mysql://localhost/test";
Properties info = new Properties();
info.put("user", "root");
info.put("password", "");
dbConnection = DriverManager.getConnection(url, info);
if (dbConnection != null)
{
System.out.println("Successfully connected to MySQL database test");

}
}
catch (SQLException ex)
{
System.out.println("An error occurred while connecting MySQL databse");
ex.printStackTrace();
}
// our SQL SELECT query.
// if you only need a few columns, specify them by name instead of using "*"
String query = "SELECT * FROM coffee";
// create the java statement
Statement st = dbConnection.createStatement();
// execute the query, and get a java resultset
ResultSet rs = st.executeQuery(query);
// iterate through the java resultset
while (rs.next())
{
int id = rs.getInt("id");
String coffee_name = rs.getString("coffee_name");
int priced= rs.getInt("priced");
// print the results
System.out.format("\n%d, %s, %d", id,coffee_name,priced);
}
// inserting records
String query1 = "insert into coffee (coffee_name, priced) values ('Tajmahal', 950)";
// Inserting reco rd
PreparedStatement stmt=dbConnection.prepareStatement("insert into coffee values(?,?)");// rds into mysql preparedstatement
stmt.execute(query1);
stmt.close();
}
catch (Exception e)
{
System.err.println("Got an exception! ");
System.err.println(e.getMessage());
}
}
}