def gv
pipeline {
    agent { label 'slave' } 
    stages {
        stage("init"){
            
            steps{
                script{
                    gv = load "script.groovy"
                    
                }
            }
            
        }
                stage("clone"){
            
            steps{
                gv.clone
            }
            
        }
        stage("build") {
            steps {
               
                script{
                    gv.build()
                    
                }
                
            }
        }
        stage("artifact") {
            steps {
                   script{
                    gv.artifact()
                    
                }
            }
        }
    }
