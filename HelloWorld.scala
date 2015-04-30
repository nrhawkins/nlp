package experimenting

import edu.stanford.nlp.pipeline.Annotation
import edu.stanford.nlp.ling.CoreAnnotations
import edu.stanford.nlp.pipeline.StanfordCoreNLP
import edu.stanford.nlp.dcoref.CorefCoreAnnotations
import edu.stanford.nlp.dcoref.SieveCoreferenceSystem
import edu.stanford.nlp.dcoref.Document
import edu.stanford.nlp.dcoref.RuleBasedCorefMentionFinder
import edu.stanford.nlp.dcoref.Dictionaries

import java.util.Properties

object HelloWorld {

 def main(Args: Array[String]){
 
   println("Hello World!")
   
   val runtime = Runtime.getRuntime()

   val mb = 1024*1024
   
   //Print used memory
   System.out.println("Used Memory:"  + (runtime.totalMemory() - runtime.freeMemory()) / mb)
 
   //Print free memory
   System.out.println("Free Memory:" + runtime.freeMemory() / mb )
         
   //Print total available memory
   System.out.println("Total Memory:" + runtime.totalMemory() / mb )
 
   //Print Maximum available memory
   System.out.println("Max Memory:" + runtime.maxMemory() / mb )
   
   
   // creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution 
   //val props = new Properties()
   //props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref")
   //val pipeline = new StanfordCoreNLP(props)
 
 }

}

