def call(String project) {



        
  sh 'docker build . -t mailrahulsre/devops-training:$Docker_tag'
		   withCredentials([string(credentialsId: 'docker_password', variable: 'docker_password')]) {
				    
				  sh 'docker login -u mailrahulsre -p $docker_password'
				  sh 'docker push mailrahulsre/devops-training:$Docker_tag'
			}
}
