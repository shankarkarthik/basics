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
package org.basics.rmi.calculator;

/**
 * @author Anita Onnuvel
 *
 */
public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements ICalculator {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    // Implementation need to have constructor to define possibility of
    // RemoteException
    public CalculatorImpl() throws java.rmi.RemoteException {
        super();
    }
    public long add(long a, long b) throws java.rmi.RemoteException {
        return a + b;
    }
    public long subtract(long a, long b) throws java.rmi.RemoteException {
        return a - b;
    }
    public long multiply(long a, long b) throws java.rmi.RemoteException {
        return a * b;
    }
    public long divide(long a, long b) throws java.rmi.RemoteException {
        return a / b;
    }
}
