/*
 * Copyright 2016 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package org.mycompany;

import java.util.ArrayList;
import java.util.Random;


public class Greeting {
	
	
	private ArrayList<String> getAllPhrases(){
		ArrayList<String> allphrases = new ArrayList<String>();
		
		allphrases.add("HI");
		allphrases.add("HELLO");
		allphrases.add("BONJOUR");
		allphrases.add("HOLA");
		allphrases.add("GUTEN TAG");
		allphrases.add("CIAO");
		allphrases.add("NAMASTE");
		allphrases.add("OLÀ");
		allphrases.add("ZDRAS-TVUY-TE");
		allphrases.add("KONNICHIWA");
		allphrases.add("AHN-YOUNG-HA-SE-YO");
		allphrases.add("MERHABA");
		allphrases.add("NI HAU");
		allphrases.add("SANNU");
		
		
		return allphrases;
		
	}

    public String greet() {
    		ArrayList<String> allphrases = getAllPhrases();
    		Random ran = new Random();
    		
    		int randomInt = 0 + ran.nextInt((allphrases.size()-1) - 0 + 1);
    		
    		String greeting = allphrases.get(randomInt);
    		return greeting;
    }

}
