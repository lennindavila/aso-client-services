mvn -X -Dhttps.protocols=TLSv1.2 sonar:sonar \
  -Dsonar.projectKey=lennindavila_aso-client-services \
  -Dsonar.organization=lennindavila-github \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=2e63eeaf0143377f61436b6a1eb71d1fc4dd3c74