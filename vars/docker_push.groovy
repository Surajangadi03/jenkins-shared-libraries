def call(String ProjectName, String ImageTag){
  withCredentials([usernamePassword(credentialsId:'dockerhub',passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){
     sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
     sh "docker push ${dockerhubuser}/${ProjectName}:${ImageTag}"
  }
}
