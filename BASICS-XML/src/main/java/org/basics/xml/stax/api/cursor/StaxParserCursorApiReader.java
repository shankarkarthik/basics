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
package org.basics.xml.stax.api.cursor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.URL;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * @author Anita Onnuvel
 *
 */
public class StaxParserCursorApiReader {

    public static void main( String[] pArgs ){
        try {
            URL lResourceUrl = StaxParserCursorApiReader.class.getResource( "/org/basics/xml/sample.xml" );
            String lFileName =  lResourceUrl.toString().substring( 6, lResourceUrl.toString().length() );
            XMLInputFactory lXMLInputFactory = XMLInputFactory.newInstance();
            Reader lReader = new FileReader( lFileName );
            XMLStreamReader lXMLStreamReader = lXMLInputFactory.createXMLStreamReader( lReader );
            while ( lXMLStreamReader.hasNext() ) {
                System.out.println( "--> hasNext()" );
                lXMLStreamReader.next();
                if( lXMLStreamReader.getEventType() == XMLStreamReader.START_ELEMENT ){
                    System.out.println( "START_ELEMENT :: '" + lXMLStreamReader.getLocalName() + "'" );
                }
                if( lXMLStreamReader.getEventType() == XMLStreamReader.CHARACTERS ){
                    System.out.println( "CHARACTERS :: '" + lXMLStreamReader.getText() + "'" );
                }
            }
        } catch ( FileNotFoundException | XMLStreamException ex ) {
            ex.printStackTrace();
        }
    }
    
}
