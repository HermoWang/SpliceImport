package com.cn.zerocode;

import com.cn.zerocode.table_dsec.Table;
import com.cn.zerocode.utils.GetDDL;

import org.junit.Test;

import java.util.List;

public class Connection_Test {
      @Test
     public void testOrcale() {

           List<Table> b = (List<Table>) GetDDL.getDDl("B");
           for(Table ss:b){
                 System.out.println(ss.toString());
           }
      }
}
