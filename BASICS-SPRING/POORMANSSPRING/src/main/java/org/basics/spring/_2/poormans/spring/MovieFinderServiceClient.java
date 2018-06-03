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
package org.basics.spring._2.poormans.spring;

import org.basics.spring.movelister.pojo.Movie;
import org.basics.spring.moviefinder.MovieFinderService;
import org.basics.spring.movielister.MovieListerCriteria;

/**
 * @author Anita Onnuvel
 *
 */
public class MovieFinderServiceClient {
    
    public static void main( String[] pArgs ) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        MovieFinderService lMovieFinderService = new MovieFinderService();
        lMovieFinderService.setMovieLister( PoorMansSpringContainer.getInstance().getFileMovieLister() );
        Movie lCsvMovie = lMovieFinderService.findMovie( MovieListerCriteria.Year, "1983" );
        System.out.println( "From File :: " + lCsvMovie );
        
        lMovieFinderService.setMovieLister( PoorMansSpringContainer.getInstance().getDbMovieLister() );
        Movie lDbMovie = lMovieFinderService.findMovie( MovieListerCriteria.Year, "1983" );
        System.out.println( "From Db :: " + lDbMovie );
    }

}
