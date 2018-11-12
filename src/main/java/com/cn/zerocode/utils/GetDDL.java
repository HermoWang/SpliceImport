/**
 * @author Pu Wang
 * @date 11/9/2018
 */

package com.cn.zerocode.utils;

import com.cn.zerocode.table_dsec.Table;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GetDDL {

    /**
     * @param tablename
     * @return
     */
    public static List<Table> getDDl(String tablename){
        List<Table> listtables=new ArrayList<>();
        try {
            Connection connection = OracleConnection.getConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM  user_tab_cols  where table_name=?");
            preparedStatement.setString(1,tablename);
            // Statement statement =connection.createStatement();
              ResultSet resultSet = preparedStatement.executeQuery();
           // ResultSet resultSet = statement.executeQuery("select * from user_tab_cols where table_name='?'");
          while (resultSet.next()){
              String tableName = resultSet.getString("Table_name");
              String columnName = resultSet.getString("COLUMN_NAME");
              String dataType =resultSet.getString("DATA_TYPE");
              int dataLength = resultSet.getInt("DATA_LENGTH");
              int dataPrecision = resultSet.getInt("DATA_PRECISION");
              int dataScale = resultSet.getInt("DATA_SCALE");
              String nullable = resultSet.getString("NULLABLE");
              Table table=new Table(tableName,columnName,dataType,dataLength,dataPrecision,dataScale,nullable);
              listtables.add(table);
          }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return listtables;
    }
}
