/**
 * @author Pu Wang
 * @date 11/9/2018
 */

package com.cn.zerocode.utils;

import com.cn.zerocode.table_dsec.Table;
import java.util.List;

public class OracleToSM {

    /**
     * @param list
     */
    public static void matching(List<Table> list){
        for (Table ss:list){
            if(ss.getColumnname().equals("VARCHAR2")){
                ss.setColumnname("VARCHAR");
            }else if (ss.getColumnname().equals("DATE")){
                ss.setColumnname("TIMESTAMP");
            }else if (ss.getColumnname().equals("NUMBER")){
                ss.setColumnname("NUMERIC");
            }
        }
     }
}

