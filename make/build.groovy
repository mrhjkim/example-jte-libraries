void call(){
  node {
	  stage("Build"){
		println "make: build()"
		sh 'make build'
	  }
  }
}
