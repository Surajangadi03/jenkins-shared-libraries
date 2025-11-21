def call(String ProjectNmae, String ImageTag){
  sh "docker run -d -p 6000:8000 ${ProjectName}/${ImageTag}"
}
