/**
 * @author Pu Wang
 * @date 11/9/2018
 */

package com.cn.zerocode.utils;

import org.apache.commons.dbcp.BasicDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.IOException;
import java.util.Properties;

public class OracleConnection {
    //连接池对象
    private static BasicDataSource ds;

    //加载参数
    static{
    Properties p = new Properties();
        try {
            //创建连接池
            p.load(OracleConnection.class.getClassLoader().getResourceAsStream("db.properties"));
                    String driver = p.getProperty("driver");
                    String url = p.getProperty("url");
                    String user = p.getProperty("user");
                    String pwd = p.getProperty("pwd");
                    String initSize = p.getProperty("initSize");
                    String maxSize = p.getProperty("maxSize");
            //设置参数
            ds = new BasicDataSource();

            ds.setDriverClassName(driver);
            ds.setUrl(url);
            ds.setUsername(user);
            ds.setPassword(pwd);
            ds.setInitialSize(new Integer(initSize));
            ds.setMaxActive(new Integer(maxSize));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("加载配置文件失败",e);
        }
    }

    /**
   * 以上就是将配置文件里的参数全部读取出来，接下来就是要
     * 写两个方法，一个是用来创建连接的，一个关闭连接
   */
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }

    public static void close(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("关闭连接失败",e);
            }
        }
    }
}

