package com.cn.zerocode.table_dsec;

public class Table {
            private String tablename;
            private String columnname;
            private String datatype;
            private int datelength;
            private int dataprecision;
            private int datascale;
            private String nullable;

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public int getDatelength() {
        return datelength;
    }

    public void setDatelength(int datelength) {
        this.datelength = datelength;
    }

    public int getDataprecision() {
        return dataprecision;
    }

    public void setDataprecision(int dataprecision) {
        this.dataprecision = dataprecision;
    }

    public int getDatascale() {
        return datascale;
    }

    public void setDatascale(int datascale) {
        this.datascale = datascale;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public Table() {

    }

    public Table(String tablename, String columnname, String datatype, int datelength, int dataprecision, int datascale, String nullable) {
        this.tablename = tablename;
        this.columnname = columnname;
        this.datatype = datatype;
        this.datelength = datelength;
        this.dataprecision = dataprecision;
        this.datascale = datascale;
        this.nullable = nullable;
    }

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
