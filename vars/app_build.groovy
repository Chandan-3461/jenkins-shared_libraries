def call{
  echo "Perform Application Build"
	sh 'mvn clean package'
}
