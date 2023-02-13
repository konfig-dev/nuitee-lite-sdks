Pod::Spec.new do |s|
  s.name = 'Nuitee'
  s.ios.deployment_target = '9.0'
  s.osx.deployment_target = '10.11'
  s.tvos.deployment_target = '9.0'
  s.watchos.deployment_target = '3.0'
  s.version = '1.0.0'
  s.source = { :git => 'https://github.com/konfig-dev/nuitee-lite-sdks.git', :tag => '1.0.0-swift' }
  s.authors = 'nuitee.com'
  s.license = 'MIT'
  s.homepage = 'https://github.com/konfig-dev/nuitee-lite-sdks/tree/main/swift'
  s.summary = 'Nuitee Swift SDK'
  s.source_files = 'Nuitee/**/*.swift'
  s.dependency 'AnyCodable-FlightSchool', '~> 0.6.1'
end
