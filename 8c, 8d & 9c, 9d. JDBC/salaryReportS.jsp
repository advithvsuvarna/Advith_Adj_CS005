<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Salary Report - Emp Name Starting with S</title>
    <style>
        body {
            font-family: monospace;
        }
        .line {
            border-top: 1px solid #000;
            margin: 10px 0;
        }
    </style>
</head>
<body>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    int grandTotal = 0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp WHERE Emp_Name LIKE 'S%'");

        while (rs.next()) {
            int no = rs.getInt("Emp_NO");
            String name = rs.getString("Emp_Name");
            int salary = rs.getInt("Basicsalary");
            grandTotal += salary;
%>
Emp_No    : <%= no %>  
Emp_Name  : <%= name %>  
Basic     : <%= salary %>  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
Grand Total Salary = <%= grandTotal %>  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
</body>
</html>