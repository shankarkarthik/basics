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
package org.basics.xml.stax.api.iterator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.URL;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.basics.xml.stax.api.cursor.StaxParserCursorApiReader;

/**
 * @author Anita Onnuvel
 *
 */
public class StaxParserIteratorApiReader {

    public static void main( String[] pArgs ){
        try {
            URL lResourceUrl = StaxParserIteratorApiReader.class.getResource( "/org/basics/xml/sample.xml" );
            String lFileName =  lResourceUrl.toString().substring( 6, lResourceUrl.toString().length() );
            XMLInputFactory lXMLInputFactory = XMLInputFactory.newInstance();
            Reader lReader = new FileReader( lFileName );
            XMLEventReader lXMLEventReader = lXMLInputFactory.createXMLEventReader( lReader );
            while ( lXMLEventReader.hasNext() ) {
                System.out.println( "--> hasNext()" );
                XMLEvent lXMLEvent = lXMLEventReader.nextEvent();
                if( lXMLEvent.isStartElement() ){
                    StartElement lStartElement = ( StartElement ) lXMLEvent;
                    System.out.println( "StartElement :: '" + lStartElement.getName() + "'" );
                    Iterator<Attribute> lAttributeIterator = lStartElement.getAttributes();
                    while ( lAttributeIterator.hasNext() ) {
                      Attribute lAttribute = ( Attribute ) lAttributeIterator.next();
                      QName lQName = lAttribute.getName();
                      String lAttributeValue = lAttribute.getValue();
                      System.out.println( "Attribute Name/Value: '" + lQName + "/" + lAttributeValue + "'" );
                    }
                }
                if( lXMLEvent.isEndElement() ){
                    EndElement lEndElement = ( EndElement ) lXMLEvent;
                    System.out.println( "EndElement:" + lEndElement.getName() + "'" );
                }
                
                if( lXMLEvent.isCharacters() ){
                    Characters lCharacters = ( Characters ) lXMLEvent;
                    System.out.println( "Characters :: '" + lCharacters.getData() + "'" );
                }
            }
        } catch ( FileNotFoundException | XMLStreamException ex ) {
            ex.printStackTrace();
        }
    }
    
}
