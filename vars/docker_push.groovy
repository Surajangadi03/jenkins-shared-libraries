def call(String ProjectName, String ImageTag, String userName){
  withCredentials(usernamePassword[CredentialsId:'DockerHub',passwordVariable:'dockerhubpass', usernameVariable:'dockerhubuser']){
     sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${ProjectName}:${ImageTag}"
}
