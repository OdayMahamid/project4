def clone(){
git branch: 'main', url: 'https://github.com/spring-guides/gs-gradle'
}
def build(){
    script{
        dir("complete"){
            sh ./gradlew clean build
            sh ./gradlew jar
        }
    }
}
def artifact(){
  archiveArtifacts artifacts: '**/*.tar', followSymlinks: false
}
return this

