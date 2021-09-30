def clone(){
git branch: 'main', url: 'https://github.com/spring-guides/gs-gradle'
}
def build(){
    script{
    cd complete && ./gradlew clean build
    cd complete && ./gradlew jar
    }
}
def artifact(){
  archiveArtifacts artifacts: '**/*.tar', followSymlinks: false
}
return this

