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
package org.basics.javafundamentals.nestedclasses;

/**
 * @author Anita Onnuvel
 *
 */
public class OuterClass {
    
    int mOuterClassVariable = 20;
    
    static int mStaticOuterClassVariable = 40;
    
    /**
     * 
     * @author Anita Onnuvel
     *
     */
    public static class NestedStaticClass {
        int mNestedStaticClassVariable = mStaticOuterClassVariable + 1;
        
        public void printNestedStaticClassVariable(){
            System.out.println( mNestedStaticClassVariable );
        }
    }
    
    /**
     * 
     * @author Anita Onnuvel
     *
     */
    public class NestedInnerClass {
        int mNestedInnerClassVariable = mOuterClassVariable + 1;
        
        public void printNestedInnerClassVariable(){
            System.out.println( mNestedInnerClassVariable );
        }
    }

    
    public void methodLocalClass( final int pMethodLocalFormalParameter ){
        
        int lMethodLocalVariable = 100;
        final int lMethodLocalVariableFinal = 100;
        
        class LocalClass {
            public int mPublicLocalClassVariable = 1;
            private int mPrivateLocalClassVariable = 2;
            private int mPrivateLocalClassVariable2 = pMethodLocalFormalParameter;
            private int mPrivateLocalClassVariable3 = lMethodLocalVariableFinal;
        }
        
        LocalClass lLocalClass = new LocalClass();
        System.out.println( lLocalClass.mPublicLocalClassVariable );
        System.out.println( lLocalClass.mPrivateLocalClassVariable );
        System.out.println( lLocalClass.mPrivateLocalClassVariable2 );
        System.out.println( lLocalClass.mPrivateLocalClassVariable3 );
        
        
    }
}
