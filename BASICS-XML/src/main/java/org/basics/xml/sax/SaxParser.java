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

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * @author Anita Onnuvel
 *
 */
public class SaxParser {
    
    public static void main( String[] pArgs ) {
        
        try {
            SAXParserFactory lSaxParserFactory = SAXParserFactory.newInstance();
            SAXParser lSaxParser = lSaxParserFactory.newSAXParser();
            URL lResourceUrl = SaxParser.class.getResource( "/org/basics/xml/sample.xml" );
            System.out.println( "The Resource is located at :: " + lResourceUrl );
            lSaxParser.parse( lResourceUrl.toString(), new SaxParsingDefaultHandler() );
        } catch ( ParserConfigurationException | SAXException | IOException ex ) {
            ex.printStackTrace();
        }
     
    }

}
