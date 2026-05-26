def call(String credId, String imageName1, String imageName2) {

    withCredentials([usernamePassword(
        credentialsId: credId,
        usernameVariable: 'DockerHubUser',
        passwordVariable: 'DockerHubPass'
    )]) {

        sh """
            echo "\$DockerHubPass" | docker login -u "\$DockerHubUser" --password-stdin

            docker tag ${imageName1} \$DockerHubUser/${imageName1}:latest
            docker tag ${imageName2} \$DockerHubUser/${imageName2}:latest

            docker push \$DockerHubUser/${imageName1}:latest
            docker push \$DockerHubUser/${imageName2}:latest
        """
    }
}