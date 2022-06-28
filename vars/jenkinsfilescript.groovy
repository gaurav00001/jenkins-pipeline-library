#!/usr/bin/env groovy
def jenkinsFile
stage('Loading Jenkins file') {
  jenkinsFile = fileLoader.fromGit('gaurav00001/Jenkinsfilefromremote/Jenkinsfile', 'https://github.com/gaurav00001/Jenkinsfilefromremote.git', 'master', null, '')
}

jenkinsFile.start()
