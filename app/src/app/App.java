package app;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

               
    private static final String PATTERN ="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}";
   
    
    
    public static void main(String args[]){ 
		String cont = "Test2020";
                
 
		Pattern pattern = Pattern.compile(PATTERN);
		
                
		  Matcher matcher = pattern.matcher(cont);
		  if(matcher.matches()){
			  System.out.println("Contrasenia "+ cont +" es Valida");
		  }else{
			  System.out.println("Contrasenia "+ cont +" es Invalida");
                          if( cont.length() < 8){
                              int f =  8 - cont.length() ;
                              System.out.println("faltan " + f + " caractere(s)" );
                          }
                          
                          if( cont.isEmpty() ){                            
                              System.out.println("Ingresa un dato" );
                          }
                          
                          
		  }		  
		
                
	}
        
    }
    

