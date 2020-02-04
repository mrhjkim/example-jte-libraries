void call(){
  stage("Build"){
    println "make: build()"
	sh 'make build'
  }
}
