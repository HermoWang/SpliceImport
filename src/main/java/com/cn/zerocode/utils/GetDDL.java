package com.cn.zerocode.utils;

import com.cn.zerocode.table_dsec.Table;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class GetDDL {

            public static List<Table> getDDl(String tablename){
                List<Table> listtables=new ArrayList<>();
                try {
                    Connection connection = OracleConnection.getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM  user_tab_cols  where table_name=?");
                     preparedStatement.setString(1,tablename);
                    // Statement statement =connection.createStatement();
                      ResultSet resultSet = preparedStatement.executeQuery();
                   // ResultSet resultSet = statement.executeQuery("select * from user_tab_cols where table_name='?'");
                  while (resultSet.next()){

                      String table_name = resultSet.getString("Table_name");
                      String   COLUMN_NAME = resultSet.getString("COLUMN_NAME");
                      String   DATA_TYPE=resultSet.getString("DATA_TYPE");
                      int data_length = resultSet.getInt("DATA_LENGTH");
                      int data_precision = resultSet.getInt("DATA_PRECISION");
                      int data_scale = resultSet.getInt("DATA_SCALE");
                       String nullable = resultSet.getString("NULLABLE");
                       Table table=new Table(table_name,COLUMN_NAME,DATA_TYPE,data_length,data_precision,data_scale,nullable);
                                  listtables.add(table);
                  }


                } catch (SQLException e) {
                    e.printStackTrace();
                }

                 return listtables;

            }
}
