package Entidades;

import org.mindrot.jbcrypt.BCrypt;

public class CriptoApp {

    public static void main(String[] args) {
        
        String complexidade = BCrypt.gensalt(10);      
        
        Usuario ivan = new Usuario();
        
        ivan.setUsername("Ivan10br");
        ivan.setSenha(BCrypt.hashpw("12345", complexidade));
        
        System.out.println("Username: " + ivan.getUsername());
        System.out.println("Username: " + ivan.getSenha());
        
        if(BCrypt.checkpw("12345", "$2a$10$vnA4Si11Uokn/Hi4IdiF7.hxYrbFyik/gFkbPwSQBzeVU4qyGn2h.")){
            
            System.out.println("Deu Match");
        }else{
            System.out.println("Não deu Match");
        }
        
        System.out.println("---------------");
        
        Usuario markennedy = new Usuario();
        
        markennedy.setUsername("Markennedy22@");
        markennedy.setSenha(BCrypt.hashpw("654321", complexidade));
        
        System.out.println("Username: " + markennedy.getUsername());
        System.out.println("Username: " + markennedy.getSenha());
        
        if(BCrypt.checkpw("654321", "$2a$10$QzqHFME.3F.6WKGgKCkMM.uKeAOx/Z07XrNNTM39WRoyYGAECIizy")){
            
            System.out.println("Deu Match");
        }else{
            System.out.println("Não deu Match");
        }
        
        System.out.println("---------------");
         
        Usuario kayo = new Usuario();
        
        kayo.setUsername("Kayo12a");
        kayo.setSenha(BCrypt.hashpw("19919", complexidade));
        
        System.out.println("Username: " + kayo.getUsername());
        System.out.println("Username: " + kayo.getSenha());
        
        if(BCrypt.checkpw("19919", "$2a$10$08GpGu3re8v4/kx4/IJhz..mC8LHYT9GMYaH4yHseM3YBGqfM6xOy")){
            
            System.out.println("Deu Match");
        }else{
            System.out.println("Não deu Match");
        }
        
        System.out.println("---------------");
         
        Usuario izabella = new Usuario();
        
        izabella.setUsername("Iza19#");
        izabella.setSenha(BCrypt.hashpw("221987", complexidade));
        
        System.out.println("Username: " + izabella.getUsername());
        System.out.println("Username: " + izabella.getSenha());
        
        if(BCrypt.checkpw("221987", "$2a$10$KtBjBF1odjJtd277h0AxcON3C8k7CSA9.beCkzHNSkGXSJOPqmHtG")){
            
            System.out.println("Deu Match");
        }else{
            System.out.println("Não deu Match");
        }
    }
    
}
