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

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Anita Onnuvel
 *
 */
public class DomParserReader {

    /**
     * @param args
     */
    public static void main( String[] pArgs ) { 
        try {
            URL lResourceUrl = DomParserReader.class.getResource( "/org/basics/xml/sample.xml" );
            DocumentBuilderFactory lDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder lDocumentBuilder = lDocumentBuilderFactory.newDocumentBuilder();
            Document lDocument = lDocumentBuilder.parse( lResourceUrl.toString() );
            lDocument.getDocumentElement().normalize();
            System.out.println( "Root element :" + lDocument.getDocumentElement().getNodeName() );
            NodeList lNodeList = lDocument.getElementsByTagName( "person" );
            for ( int lCounter = 0; lCounter < lNodeList.getLength(); lCounter++ ) {     
               Node lNode = lNodeList.item( lCounter );
               if ( lNode.getNodeType() == Node.ELEMENT_NODE) {
                  Element lElement = ( Element ) lNode;     
                  System.out.println( "First Name : " + getTagValue( "firstname", lElement));
                  System.out.println( "Last Name : " + getTagValue( "lastname", lElement));
                  System.out.println( "Age : " + getTagValue( "age", lElement));
                  System.out.println( "Sex : " + getTagValue( "sex", lElement));
               }
            }
        } catch( Exception ex ) {
            ex.printStackTrace();
        }
    }
    
    /**
    *
    */
    private static String getTagValue( String pElementTagName, Element pElement ) {
        NodeList lNodeList = pElement.getElementsByTagName( pElementTagName ).item( 0 ).getChildNodes();
        Node lNode = ( Node ) lNodeList.item(0); 
        return lNode.getNodeValue();
    }
}