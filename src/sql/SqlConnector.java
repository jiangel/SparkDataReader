package sql;
import java.sql.*;
public class SqlConnector {
	Connection conn;
	public SqlConnector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("����MySQL����");
        }catch(ClassNotFoundException e1){
            System.out.println("�Ҳ���MySQL����!");
            e1.printStackTrace();
        }
        String url="jdbc:mysql://localhost:3306/spark_movie?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        try {
            conn = DriverManager.getConnection(url,"root","zhuhaichao1248");
            //����һ��Statement����
            //Statement stmt = conn.createStatement(); //����Statement����
            //System.out.println("���ӵ����ݿ�");
            //stmt.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
	}
    public Connection getconnetion(){
        return conn;
    }
}