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

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 * @author Anita Onnuvel
 *
 */
public class StaxParserCursorApiWriter {
    
    public static void main( String[] pArgs ){
        Writer lStringWriter = new StringWriter();
        try {
            XMLOutputFactory lXMLOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter lXMLStreamWriter = lXMLOutputFactory.createXMLStreamWriter( lStringWriter );

            lXMLStreamWriter.writeStartDocument();
            // Now start with root element
            lXMLStreamWriter.writeStartElement( "root" );
            // start Category item
            lXMLStreamWriter.writeStartElement( "item" );
            lXMLStreamWriter.writeAttribute( "id", "Category"  );
            lXMLStreamWriter.writeAttribute( "parent_id", "0" );
            lXMLStreamWriter.writeStartElement( "content" );
            lXMLStreamWriter.writeStartElement( "name" );
            lXMLStreamWriter.writeAttribute( "class", "checkbox-disabled" );
            lXMLStreamWriter.writeAttribute( "state", "open" );
            lXMLStreamWriter.writeCharacters( "Category" );
            // end Category item name element
            lXMLStreamWriter.writeEndElement();
            // end Category item content element
            lXMLStreamWriter.writeEndElement();
            // end Category item element
            lXMLStreamWriter.writeEndElement();
            // end root element
            lXMLStreamWriter.writeEndElement();
            // Write document end. This closes all open structures
            lXMLStreamWriter.writeEndDocument();
            // Close the writer to flush the output
            lXMLStreamWriter.close();
        } catch ( XMLStreamException exXMLStream ) {
            exXMLStream.printStackTrace();
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
        System.out.println( lStringWriter.toString() );
    }


}
