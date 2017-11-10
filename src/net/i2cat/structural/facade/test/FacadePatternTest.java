package net.i2cat.structural.facade.test;

import net.i2cat.structural.facade.HelperFacade;

public class FacadePatternTest {
    public static void main(String[] args) {
        String tableName = "Employee";
        // Without usig Facade
//        Connection con = MySqlHelper.getMySqlDBConnection();
//        MySqlHelper mySqlHelper = new MySqlHelper();
//        mySqlHelper.generateMySqlHTMLReport(tableName, con);
//
//        Connection con1 = MySqlHelper.getMySqlDBConnection();
//        OracleHelper oracleHelper = new OracleHelper();
//        oracleHelper.generateOraclePDFReport(tableName, con1);

        // Using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
