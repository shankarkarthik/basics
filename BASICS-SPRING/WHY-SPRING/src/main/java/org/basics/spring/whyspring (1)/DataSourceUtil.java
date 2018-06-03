package org.basics.spring.whyspring;
import java.sql.SQLException;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 * @author Anita Onnuvel
 * 
 */
public class DataSourceUtil {
    
    public static DataSource setupH2DataSource() {
        BasicDataSource lBasicDataSource = new BasicDataSource();
        lBasicDataSource.setDriverClassName( "org.h2.Driver" );
        lBasicDataSource.setUsername( "sa" );
        lBasicDataSource.setPassword( "" );
        lBasicDataSource.setUrl( "jdbc:h2:~/why_spring_db" );
        lBasicDataSource.setMaxActive( 20 );
        lBasicDataSource.setMinIdle( 10 );
        return lBasicDataSource;
    }

    public static void printDataSourceStats( DataSource pDataSource )
            throws SQLException {
        BasicDataSource lBasicDataSource = ( BasicDataSource ) pDataSource;
        System.out.println( "NumActive: " + lBasicDataSource.getNumActive() );
        System.out.println( "NumIdle: " + lBasicDataSource.getNumIdle() );
    }

    public static void shutdownDataSource( DataSource pDataSource ) throws SQLException {
        BasicDataSource lBasicDataSource = ( BasicDataSource ) pDataSource;
        lBasicDataSource.close();
    }
}
