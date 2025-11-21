def call(String ProjectName, String ImageTag){
  sh "docker rm -f notes-container && docker run -d --name notes-container -p 6000:8000 ${projectName}:${imageTag}"
}
