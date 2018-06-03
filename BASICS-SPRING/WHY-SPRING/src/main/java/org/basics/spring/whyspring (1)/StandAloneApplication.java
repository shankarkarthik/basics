/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.basics.spring.whyspring;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

/**
 * @author Anita Onnuvel
 * 
 */
public class StandAloneApplication {

    /**
     * 
     * @param pArgs
     */
    public static void main( String[] pArgs ) {
        System.out.println( "Setting up data source." );
        DataSource lDataSource = DataSourceUtil.setupH2DataSource();
        System.out.println( "Done." );
        Connection lConnection = null;
        Statement lStatement = null;
        ResultSet lResultSet = null;
        try {
            System.out.println( "Creating connection." );
            lConnection = lDataSource.getConnection();
            System.out.println( "Creating statement." );
            lStatement = lConnection.createStatement();
            System.out.println( "Executing statement." );
            lStatement.execute( "CREATE TABLE  IF NOT EXISTS WHY_SPRING (WHY_SPRING_ID VARCHAR(255) )" );
        } catch ( SQLException e ) {
            e.printStackTrace();
        } finally {
            try {
                lResultSet.close();
            } catch ( Exception e ) {
            }
            try {
                lStatement.close();
            } catch ( Exception e ) {
            }
            try {
                lConnection.close();
            } catch ( Exception e ) {
            }
            try {
                DataSourceUtil.shutdownDataSource( lDataSource );
            } catch ( SQLException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            
            List<Integer> lMyList = new ArrayList<Integer>();
            
            for ( Integer lInteger : lMyList ){
                System.out.println( lInteger );
            }
        }
    }

}
