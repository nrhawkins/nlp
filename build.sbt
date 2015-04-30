name := "nlp"

version := "1.0"

scalaVersion := "2.10.2"

javaOptions in run += "-Xmx10G"

libraryDependencies ++= Seq(
"com.github.nscala-time" %% "nscala-time" % "1.4.0",
"com.typesafe" % "config" % "1.2.1",
//"edu.mit" % "jwi" % "2.2.3",
//"edu.stanford.nlp" % "stanford-corenlp" % "3.5.2",
//"edu.stanford.nlp" % "stanford-parser" % "3.5.1",
//"edu.washington.cs.knowitall.nlptools" % "nlptools-wordnet-uw_2.10" % "2.4.5",
//"edu.washington.cs.knowitall.taggers" % "taggers-core_2.10" % "0.4",
"org.scala-lang" % "scala-compiler" % "2.10.2",
"org.scala-lang" % "scala-reflect" % "2.10.2",
"org.scala-lang" % "scala-library" % "2.10.2"
)
