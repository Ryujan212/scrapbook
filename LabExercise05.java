
package labexercise05;

import java.util.Scanner;


public class LabExercise05 {

    
    public static void main(String[] args) {
        String FavHobby;
        int age;
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("What is your favorite hubby? ");
        FavHobby = scanner.nextLine();
       
         
         System.out.print("How old are you? ");
         age = scanner.nextInt();
         
         
         int countries;
         System.out.print("How many countries have you visited? ");
         countries = scanner.nextInt();
         
         
         int number;
         System.out.print("What's your favorite number? ");
         number = scanner.nextInt();
         
         
         String movie;
         System.out.print("What's your favorite movie? ");
         movie = scanner.nextLine();
         
         
         String word;
         System.out.print("What's one word that describes you? ");
         word = scanner.nextLine();
        
         
         int scale;
         System.out.print("On a scale of 1-10, how adventurous are you? ");
         scale = scanner.nextInt();
         
         
         String title;
         System.out.print("What's your title of a book you love? Why do you hate me so much ");
         title = scanner.nextLine();
         scanner.nextLine();
         
         String dream;
         System.out.print("What's your dream travel destination? ");
         dream = scanner.nextLine();
         
         
         String skill;
         System.out.print("What's a skill you'd like to learn? ");
         skill = scanner.nextLine();
         
         
         System.out.println("Favorite Hobby: " + FavHobby);
         System.out.println("Age: " + age);
         System.out.println("Countries Visited: " + countries);
         System.out.println("Favorite Number: " + number);
         System.out.println("Favorite Movie: " + movie);
         System.out.println("One word the describes you: " + word);
         System.out.println("Adventurous Scale: " + scale);
         System.out.println("Favorite Book: " + title);
         System.out.println("Dream Travel Destination: " + dream);
         System.out.println("Skill to learn: " + skill);
         
         
         
        
         
        
         
        
       
    }
    
}
