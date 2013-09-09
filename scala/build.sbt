scalaSource in Compile := file("src")

scalaSource in Test := file("test")

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
        "org.easytesting" % "fest-assert-core" % "2.0M10" % "test",
        "com.novocode" % "junit-interface" % "0.10" % "test"
)
