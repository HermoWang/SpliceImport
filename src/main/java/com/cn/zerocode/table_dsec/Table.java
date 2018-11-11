/**
 * @author Pu Wang
 * @date 11/9/2018
 */

package com.cn.zerocode.table_dsec;

public class Table {

    private String tablename;
    private String columnname;
    private String datatype;
    private int datelength;
    private int dataprecision;
    private int datascale;
    private String nullable;

    /**
     * @return tablename
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * @param tablename 表名
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    /**
     * @return columnname
     */
    public String getColumnname() {
        return columnname;
    }

    /**
     * @param columnname 列名
     */
    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    /**
     * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * @param datatype 数据类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
     * @return datelength
     */
    public int getDatelength() {
        return datelength;
    }

    /**
     * @param datelength
     */
    public void setDatelength(int datelength) {
        this.datelength = datelength;
    }

    /**
     * @return dataprecision
     */
    public int getDataprecision() {
        return dataprecision;
    }

    /**
     * @param dataprecision
     */
    public void setDataprecision(int dataprecision) {
        this.dataprecision = dataprecision;
    }

    /**
     * @return datascale
     */
    public int getDatascale() {
        return datascale;
    }

    /**
     * @param datascale
     */
    public void setDatascale(int datascale) {
        this.datascale = datascale;
    }

    /**
     * @return nullable
     */
    public String getNullable() {
        return nullable;
    }

    /**
     * @param nullable
     */
    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public Table() {

    }

    /**
     * @param nullable
     * @param dataprecision
     * @param datascale
     * @param datelength
     * @param datatype
     * @param tablename
     * @param columnname
     */
    public Table(String tablename, String columnname,
                 String datatype, int datelength, int dataprecision,
                 int datascale, String nullable) {
        this.tablename = tablename;
        this.columnname = columnname;
        this.datatype = datatype;
        this.datelength = datelength;
        this.dataprecision = dataprecision;
        this.datascale = datascale;
        this.nullable = nullable;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Table{" +
                "tablename='" + tablename + '\'' +
                ", columnname='" + columnname + '\'' +
                ", datatype='" + datatype + '\'' +
                ", datelength=" + datelength +
                ", dataprecision=" + dataprecision +
                ", datascale=" + datascale +
                ", nullable='" + nullable + '\'' +
                '}';
    }
}
