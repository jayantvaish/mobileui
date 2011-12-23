require "rubygems"
require "buildr"
require "buildr/xmlbeans"
# require "buildr/openjpa"
# require "buildr/cobertura"

# Keep this structure to allow the build system to update version numbers.
VERSION_NUMBER = "0.0.0.001-SNAPSHOT"

require "dependencies.rb"
require "repositories.rb"

ENV['JAVA_OPTS'] ||= '-Dfile.encoding=UTF-8'


desc "Intalio Android WebApplication"
define "androidwar" do
  project.version = VERSION_NUMBER
  project.group = "com.intalio.cloud"
  
  compile.options.target = "1.5"

  desc "Android War ..."
  
    libs = [POSTGRES, MYBATIS[:spring] ,MYBATIS[:sqlmap] , MYBATIS[:core],APACHE_COMMONS[:pool],APACHE_COMMONS[:dbcp], SPRING[:spring_json],AXIS2, AXIOM,APACHE_COMMONS[:beanutils], APACHE_COMMONS[:httpclient], APACHE_COMMONS[:codec], DOM4J, JAXEN, LOG4J, SLF4J, STAX_API,SPRING[:web],SPRING[:webmvc],SPRING[:all],SPRING[:core],SPRING[:context]]
    
    compile.with [libs,SERVLET_API]
    resources.filter.using "version" => VERSION_NUMBER
    package(:war).with :libs => libs
end
