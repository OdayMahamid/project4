def clone(){
  git branch: 'master', credentialsId: 'ea80b490-f30e-4f61-b8b3-426d8202c73e', url: 'https://github.com/jleetutorial/maven-project.git'
}
def build(){
 sh 'mvn package'
}
def artifact(){
  archiveArtifacts artifacts: '**/*.war', followSymlinks: false
}
return this

