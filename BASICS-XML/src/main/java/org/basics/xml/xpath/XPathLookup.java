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
package org.basics.xml.xpath;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * @author Anita Onnuvel
 *
 */
public class XPathLookup {
    
    /**
     * @param args
     */
    public static void main( String[] pArgs ) { 
        try {
            URL lResourceUrl = XPathLookup.class.getResource( "/org/basics/xml/sample.xml" );
            DocumentBuilderFactory lDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder lDocumentBuilder = lDocumentBuilderFactory.newDocumentBuilder();
            Document lDocument = lDocumentBuilder.parse( lResourceUrl.toString() );

            // XPath
            XPathFactory lXPathFactory = XPathFactory.newInstance();
            XPath lXPath = lXPathFactory.newXPath();
            XPathExpression lXPathExpression = lXPath.compile( "//persons/person/firstname/text()" );

            Object lObjectResult = lXPathExpression.evaluate( lDocument, XPathConstants.NODESET );
            NodeList lNodeList = ( NodeList ) lObjectResult;
            for ( int i = 0; i < lNodeList.getLength(); i++ ) {
                System.out.println( lNodeList.item(i).getNodeValue() ); 
            }

        } catch( Exception ex ) {
            ex.printStackTrace();
        }
    }

}
