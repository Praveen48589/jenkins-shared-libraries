def call(String imageName, String directory){
    sh "docker build -t "${imageName} "${directory}""
}