pipeline{

	agent any
	stages{
	    
	   stage('Compile'){
	    
	   	 steps{
	     withMaven(maven: 'maven_3_6_1') {
	                      sh 'mvn clean compile'    
	                      }
	        
	      }
	    }
	    
	      
	    stage('Tests'){
	    
	   	 steps{
	     withMaven(maven: 'maven_3_6_1') {
	                      sh 'mvn test'    
	                      }
	        
	      }
	    }
	  stage('Deploy'){
	    
	   	 steps{
	     withMaven(maven: 'maven_3_6_1') {
	                      sh 'mvn deploy -DskipTests'    
	                      }
	        
	      }
	    }

	}




}
