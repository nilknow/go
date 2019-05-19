package tech.poorguy.go.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author poorguy.tech
 * @Date 2019/5/18 21:55
 * @Mail 494939649@qq.com / maxwangein@gmail.com
 **/
public class DBConnectionTest {
    public static Connection getCcnnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://47.98.129.157:3306/go?useUnicode=true&useSSL=false&characterEncoding=utf8", "root",";WhpNQG4VTtQ");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void main(String[] args){
        getCcnnection();
    }
}
