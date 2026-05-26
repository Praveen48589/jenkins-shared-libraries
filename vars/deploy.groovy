def call() {

    echo "Deploying application using Docker Compose..."

    sh '''
        docker compose down || true

        docker compose up -d --build --force-recreate
    '''
}  