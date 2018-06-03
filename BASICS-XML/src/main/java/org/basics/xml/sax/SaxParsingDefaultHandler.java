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
package org.basics.xml.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Anita Onnuvel
 *
 */
public class SaxParsingDefaultHandler extends DefaultHandler {
    
    boolean mFirstNamePresent = false;
    boolean mLastNamePresent = false;
    boolean mAgePresent = false;
    boolean mSexPresent = false;
 
    /**
     * 
     */
    public void startElement( String pUri, 
                              String pLocalName,
                              String pQualifiedName, 
                              Attributes pAttributes ) 

        throws SAXException {
        System.out.println( "Start Element :" + pQualifiedName );
        if( pQualifiedName.equalsIgnoreCase( "FIRSTNAME" ) ) {
            mFirstNamePresent = true;
        }
 
        if( pQualifiedName.equalsIgnoreCase( "LASTNAME" ) ) {
            mLastNamePresent = true;
        }
 
        if( pQualifiedName.equalsIgnoreCase( "AGE" ) ) {
            mAgePresent = true;
        }
 
        if( pQualifiedName.equalsIgnoreCase( "SEX" ) ) {
            mSexPresent = true;
        }
    }
 
    /**
     * 
     */
    public void endElement( String pUri, 
                            String pLocalName,
                            String pQualifiedName ) 
        throws SAXException { 
        System.out.println( "End Element :" + pQualifiedName ); 
    }
 
    /**
     * 
     */
    public void characters( char pCharacterArray[], 
                            int pStart, 
                            int pLength ) throws SAXException {
 
        if( mFirstNamePresent ) {
            System.out.println( "First Name : " + new String( pCharacterArray, pStart, pLength ) );
            mFirstNamePresent = false;
        }
 
        if( mLastNamePresent ) {
            System.out.println( "Last Name : " + new String( pCharacterArray, pStart, pLength ) );
            mLastNamePresent = false;
        }
 
        if( mAgePresent ) {
            System.out.println( "Age : " + new String( pCharacterArray, pStart, pLength ) );
            mAgePresent = false;
        }
 
        if( mSexPresent ) {
            System.out.println( "Sex : " + new String( pCharacterArray, pStart, pLength ) );
            mSexPresent = false;
        } 
    }
}
