def newGit(repo)
{
  git '${repo}'
}
def newMaven(){
  sh 'mvn package'
}
def newDeployment(jobname,ip,context){
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/target/java-jenkins-0.0.1-SNAPSHOT.war ubuntu@${ip}:/home/ubuntu/deployment/${context}.war"
}
def runDeployWarOnSameServer(jobname){
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/target/java-jenkins-0.0.1-SNAPSHOT.war"
}
