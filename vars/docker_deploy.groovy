def call(String ProjectName, String ImageTag){
  sh "docker rm notes-container && docker run -d --name notes-container -p 7000:8000 ${ProjectName}:${ImageTag}"
}
