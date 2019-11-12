package org.ow2.proactive.gradle;

import org.gradle.api.Project;

import lombok.Getter;
import lombok.Setter;


public class GradlePluginExampleExtension {


    @Getter
    @Setter
    private String sentenceToDisplay;
    
    public void create(Project project) {

	// The code that will implement the logic should be implemented here.
	System.out.println("Sentence: "+sentenceToDisplay);
    }  
}
