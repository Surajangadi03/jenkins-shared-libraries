def call(String ProjectName, String ImageTag){
  sh "docker rm -f notes-container || true"
  sh "docker run -d --name notes-container -p 7000:8000 ${ProjectName}:${ImageTag}"
}
