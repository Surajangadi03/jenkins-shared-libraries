def call(String ProjectName, String ImageTag){
  sh "docker run -d -p 6000:8000 ${ProjectName}:${ImageTag}"
}
