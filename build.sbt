name := "scala-grpc"

version := "1.0.0"

scalaVersion := "2.13.1"

// compiles protobuf definitions into scala code
PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)