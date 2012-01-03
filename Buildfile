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
define "mobile" do
  project.version = VERSION_NUMBER
  project.group = "com.intalio.cloud"
  compile.options.target = "1.5"
  compile.options.lint = 'all'
  desc "Android War ..."
    libs = [SERVLET_API,POSTGRES, MYBATIS[:spring] ,MYBATIS[:sqlmap] , MYBATIS[:core],APACHE_COMMONS[:pool],APACHE_COMMONS[:dbcp], SPRING[:spring_json],AXIS2, AXIOM,APACHE_COMMONS[:beanutils], APACHE_COMMONS[:httpclient], APACHE_COMMONS[:codec], DOM4J, JAXEN, LOG4J, SLF4J, STAX_API,SPRING[:web],SPRING[:webmvc],SPRING[:all],SPRING[:core],SPRING[:context],'./WebContent/WEB-INF/lib/json-rpc-1.0.jar']
    compile.from('src').into('./WebContent/WEB-INF/classes').with libs
    resources.filter.using "version" => VERSION_NUMBER
    system("cp -rfv ./src/*.xml  ./WebContent/WEB-INF/classes")
    package(:war).with(:libs => libs).include('./WebContent/WEB-INF').include('./WebContent/images').include('./WebContent/js').include('./WebContent/*.jsp')
end
