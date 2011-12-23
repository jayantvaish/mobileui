
repositories.remote = [  
  "http://repository.springsource.com/maven/libraries/external",
  "http://download.java.net/maven/2/",
  "https://oss.sonatype.org/content/repositories/central-sync",
  "http://www.intalio.org/public/maven2", 
  "http://dist.codehaus.org/mule/dependencies/maven2/", 
  "http://repo1.maven.org/maven2",
  "http://scala-tools.org/repo-releases"
]

repositories.release_to[:username] ||= "release"
repositories.release_to[:url] ||= "sftp://www.intalio.org/var/www-org/public/maven2"
repositories.release_to[:permissions] ||= 0664
