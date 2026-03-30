 public class HelloApp {

    public static void main(String[] args) 
      
      feature/UC6-substring-method
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }

        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
  main

    }

}