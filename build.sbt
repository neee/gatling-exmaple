name := "gatling5"
version := "0.1"
scalaVersion := "2.11.11"

enablePlugins(GatlingPlugin)

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.2" % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.2.2" % "test"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.3" % "test"




