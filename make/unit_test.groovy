void call(){
	node {
		def root = tool name: 'Go 1.13', type: 'go'
		withEnv(["GOROOT=${root}", "PATH+GO=${root}/bin:${HOME}/go/bin"]) {	
			stage("Unittest"){
				println "make: unit_test()"
					sh 'make junittest'
			}
		}
	}
}
