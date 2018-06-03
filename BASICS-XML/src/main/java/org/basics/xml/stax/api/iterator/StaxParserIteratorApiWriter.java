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

import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

/**
 * @author Anita Onnuvel
 *
 */
public class StaxParserIteratorApiWriter {
    
    public static void main( String[] pArgs ){

        try {
            XMLOutputFactory lXMLOutputFactory = XMLOutputFactory.newInstance();
            XMLEventFactory lXMLEventFactory = XMLEventFactory.newInstance();
            //XMLEventWriter lXMLEventWriterFile = lXMLOutputFactory.createXMLEventWriter( new FileWriter( "c:/temp/stax_iterator_writer.xml" ) );
            Writer lStringWriter = new StringWriter(); 
            XMLEventWriter lXMLEventWriter = lXMLOutputFactory.createXMLEventWriter( lStringWriter );
            XMLEvent lXMLEvent = lXMLEventFactory.createStartDocument();
            lXMLEventWriter.add( lXMLEvent );
            lXMLEvent = lXMLEventFactory.createStartElement( "ahp", "http://www.basics.org", "persons");
            lXMLEventWriter.add(lXMLEvent); 
            lXMLEvent = lXMLEventFactory.createNamespace( "ahp", "http://www.basics.org");
            lXMLEventWriter.add(lXMLEvent);
            lXMLEvent = lXMLEventFactory.createStartElement( "ahp", "http://www.basics.org", "person" );
            lXMLEventWriter.add(lXMLEvent); 
            lXMLEvent = lXMLEventFactory.createAttribute( "depends", "0" );
            lXMLEventWriter.add(lXMLEvent);
            lXMLEvent = lXMLEventFactory.createStartElement( "ahp", "http://www.basics.org", "person" );
            lXMLEventWriter.add(lXMLEvent); 
            lXMLEvent = lXMLEventFactory.createEndElement( "ahp", "http://www.basics.org", "persons");
            lXMLEventWriter.add(lXMLEvent);
            lXMLEventWriter.flush();
            System.out.println( lStringWriter.toString() );
            lXMLEventWriter.close();            
        } catch (XMLStreamException exXMLStream ) {
            exXMLStream.printStackTrace();
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }
}
