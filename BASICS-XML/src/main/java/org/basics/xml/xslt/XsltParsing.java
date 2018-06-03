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
package org.basics.xml.xslt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * @author Anita Onnuvel
 *
 */
public class XsltParsing {

    public static void main( String[] pArgs ) {
        try {
            InputStream lXslStreamSource = XsltParsing.class.getResourceAsStream( "/org/basics/xml/xml2html.xsl" );
            URL lInputStreamSource = XsltParsing.class.getResource( "/org/basics/xml/sample.xml" );
            
            TransformerFactory lTransformerFactory = TransformerFactory.newInstance();
            Transformer lTransformer = lTransformerFactory.newTransformer( new StreamSource( lXslStreamSource ) );
            lTransformer.transform( new StreamSource( lInputStreamSource.toString() ), new StreamResult( new FileOutputStream( "c:/temp/sample.html" ) ) );
        } catch ( FileNotFoundException | TransformerException ex ) {
            ex.printStackTrace();
        }
    }
}
