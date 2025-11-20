def call(String ProjectName, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:'DockerHub',passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){
     sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${ProjectName}:${ImageTag}"
}
