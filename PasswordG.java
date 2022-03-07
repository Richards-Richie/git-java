import java.util.*;
public class PasswordG {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the no of words to create password:");
        int a=s.nextInt();

        // getting the alphabet from the string array
        String Uc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Lc="abcdefghijklmnopqrstuvwxyz";
       
        
        //now the the two strings are ready to extract the alphabets
        //let us create a string that stores the each alphabet to create a password
    
        String password="";
        
        for(int i=0; i<a; i++){
            //here we are creating one random value because
            //1.so that we could get itarations
            //2.and we are multiplying with 3 because
            // we could get 3 cases 0,1,2 and
            // math.random() has 0.99999 as the largest value
            //and by multiplying with 3 gives us 2.9997
            //now by typecasting it expliitctily into integers 
            // we get max of two cases
            int random=(int)(3*Math.random());
            //now we may get 3 values 0,1,2
            switch(random){
                case 0:{
                    //here we multiplying with 0 to Math.random()
                    //because in this case we re extracting only one valueOf
                    //it can be anything  
            
                    password=password+String.valueOf((int)(0*(Math.random())));
                    break;
                }
                case 1:{
                    
                    // if random is 1 then in this case we multiply with lenght of Lc string to the math.random() function
                    //and convert it to an integer
                    
                    random=(int)(Uc.length()*Math.random());
                    
                    
                    //now we are extracting the word from Lc and storing it into password
                    
                    password=password+String.valueOf(Uc.charAt(random));
                    break;
                }
                case 2:{
    
                    // if random is 1 then in this case we multiply with lenght of Lc string to the math.random() function
                    //and convert it to an integer
                    
                    random=(int)(Uc.length()*Math.random());
                    
                    //now we are extracting the word from Lc and storing it into password
                    
                    password=password+String.valueOf(Lc.charAt(random));
                    break;
                }
            }
            
        }
        System.out.print("password: "+password);
    }   
}
