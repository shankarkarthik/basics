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
package org.basics.spring._3.usingspring;

import org.basics.spring.movelister.pojo.Movie;
import org.basics.spring.moviefinder.MovieFinderService;
import org.basics.spring.movielister.MovieListerCriteria;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Anita Onnuvel
 *
 */
public class MovieFinderServiceClient {
    
    /**
     * 
     * @param pArgs
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static void main( String[] pArgs ) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ApplicationContext lApplicationContext = new ClassPathXmlApplicationContext( new String[] { "org/basics/spring/_3/usingspring/applicationContext.xml" } );
        MovieFinderService lMovieFinderService = ( MovieFinderService ) lApplicationContext.getBean( "fileMovieFinder" );
        Movie lFindMovie = lMovieFinderService.findMovie( MovieListerCriteria.Year, "1983" );
        System.out.println( "From File :: " + lFindMovie );
        
        lMovieFinderService = ( MovieFinderService ) lApplicationContext.getBean( "dbMovieFinder" );
        lFindMovie = lMovieFinderService.findMovie( MovieListerCriteria.Year, "1983" );
        System.out.println( "From Db :: " + lFindMovie );
    }

}
