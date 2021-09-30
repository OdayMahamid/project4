def clone(){
git branch: 'main', url: 'https://github.com/spring-guides/gs-gradle'
}
def build(){
 sh 'mvn package'
}
def artifact(){
  archiveArtifacts artifacts: '**/*.tar', followSymlinks: false
}
return this

