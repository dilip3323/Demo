import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LamdaExpression {

	
	public void listoperations() {
	String ele1;
    		
    ArrayList<String> list = new ArrayList<String>();
    
     //list.replaceAll(l->l+ “text”);
    //Stream<String> test = list.stream().filter(ele->startswith("A"));                                    //filter adds a condition
     list.stream().filter(ele->ele.startsWith("")).count();           //After filter we can add function
     list.stream().filter(ele->ele.startsWith("")).forEach(ele->System.out.println(""));        //for each
     list.stream().filter(ele->ele.startsWith("")).limit(1).forEach(ele->System.out.println(""));          //after filter we can inbuitl
     list.stream().filter(ele->ele.startsWith("")).map(ele->ele.toUpperCase()).limit(1).forEach(ele->System.out.println(""));  //map helps us to modify the stream.
     	
     // We can replace the String literal with the scope operator.
     list.stream().forEach(System.out::println);
     list.stream().map(String::toUpperCase).forEach(System.out::println);

     Stream(list.stream(),list1.stream());            //This will concatenate two streams.
   
     boolean flag = list.stream().anyMatch(ele->ele.startsWith("S")); //Tihs will return boolean value
     
     //Using collect method to recieving back to the list

    List<String> st = Stream.of("Test","Test2","Test3").filter(ele->ele.startsWith("")).map(ele->ele.toUpperCase()).limit(1).forEach(ele->sysout("")).collect(Collectors.toList());
  
    List<Integer> intu =st.stream().collect(Collections.reverse(st));
	
	
	}   
    	
}
