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
package org.basics.xml.dom;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 * @author Anita Onnuvel
 *
 */
public class DomParserWriter {
    /**
     * @param args
     */
    public static void main( String[] pArgs ) { 
        try {
            DocumentBuilderFactory lDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder lDocumentBuilder = lDocumentBuilderFactory.newDocumentBuilder();
            Document lDocument = lDocumentBuilder.newDocument();
            Element lRootElement = lDocument.createElement( "root" );
            lDocument.appendChild( lRootElement );
            
            //Create a comment and put it in the root element
            Comment lCommentNode = lDocument.createComment( "First DOM Writing" );
            lRootElement.appendChild( lCommentNode );

            //Create child element, add an attribute, and add to root
            Element lChildElement = lDocument.createElement( "child" );
            lChildElement.setAttribute( "name", "value" );
            lRootElement.appendChild( lChildElement );

            //add a text element to the child
            Text lTextNode = lDocument.createTextNode( "Hurray! I created my first DOM text node" );
            lChildElement.appendChild(lTextNode);
            
            //set up a transformer
            TransformerFactory lTransformerFactory = TransformerFactory.newInstance();
            Transformer lTransformer = lTransformerFactory.newTransformer();
            lTransformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
            lTransformer.setOutputProperty( OutputKeys.INDENT, "yes" );

            //create string from xml tree
            StringWriter lStringWriter = new StringWriter();
            StreamResult lStreamResult = new StreamResult(lStringWriter);
            DOMSource lDOMSource = new DOMSource( lDocument );
            lTransformer.transform( lDOMSource, lStreamResult );
            String lXmlString = lStringWriter.toString();

            //print xml
            System.out.println( "Here's the xml: \n\n" + lXmlString );
        } catch( Exception ex ) {
            ex.printStackTrace();
        }
    }
}
