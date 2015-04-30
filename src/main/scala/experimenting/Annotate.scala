package experimenting

//import edu.stanford.nlp.pipeline.Annotation
//import edu.stanford.nlp.ling.CoreAnnotations
import edu.stanford.nlp.pipeline.StanfordCoreNLP
//import edu.stanford.nlp.dcoref.CorefCoreAnnotations
//import edu.stanford.nlp.dcoref.SieveCoreferenceSystem
//import edu.stanford.nlp.dcoref.Document
//import edu.stanford.nlp.dcoref.RuleBasedCorefMentionFinder
//import edu.stanford.nlp.dcoref.Dictionaries

import java.util.Properties
//java8
//import java.util.function.Function

object Annotate {

  def main(Args: Array[String]){
  
    println("total memory: " + Runtime.getRuntime().totalMemory())
    //the Xmx value
    println("max memory: " + Runtime.getRuntime().maxMemory())
    println("free memory: " + Runtime.getRuntime().freeMemory())  		        
    println("computed free memory: " + (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory() + Runtime.getRuntime().freeMemory()))
    println("used memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()))    
    
    println("Creating Annotation Pipeline!")

    //creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution 
    val props = new Properties()
    props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref")
    val pipeline = new StanfordCoreNLP(props)
    
    println("total memory: " + Runtime.getRuntime().totalMemory())
    //the Xmx value
    println("max memory: " + Runtime.getRuntime().maxMemory())
    println("free memory: " + Runtime.getRuntime().freeMemory())  		        
    println("computed free memory: " + (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory() + Runtime.getRuntime().freeMemory()))
    println("used memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()))    
    
  }
  
  
}
