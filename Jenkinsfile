@Library("shared_library")_
pipeline{
  agent any
  environment{
    IMAGE_NAME = 'kireeti1234/helloworld'
  }
  stages{
    stage('checkout'){
      git url: 'https://github.com/KIREETI1234/shared-library.git' , branch: 'main'
    }
    stage('function call for shared library'){
      call();
    }
  }
  
  
