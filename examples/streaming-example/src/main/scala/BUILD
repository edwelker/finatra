scala_library(
  dependencies=[
    '3rdparty/jvm/ch/qos/logback:logback-classic',
    '3rdparty/jvm/com/google/inject:guice',
    '3rdparty/jvm/org/clapper:grizzled-slf4j',
    'finatra/http/src/main/scala:scala',
    'finatra/inject/inject-app/src/main/scala:scala',
    'finatra/inject/inject-core/src/main/scala:scala',
    'finatra/inject/inject-server/src/main/scala:scala',
    'twitter-server/src/main/scala:scala',
    'util/util-app/src/main/scala:scala',
    'util/util-core/src/main/scala:scala',
    'util/util-logging/src/main/scala:scala',
  ],
  excludes = [
    exclude(org='org.slf4j', name='slf4j-jdk14')
  ],
  fatal_warnings=True,
  sources=rglobs('*.scala'),
  resources=[
    'finatra/examples/streaming-example/src/main/resources'
  ]
)
