class Human {

     public void Behaviour()
     {
         System.out.println("I am Human method");
     }



}

class Man extends  Human {

public void Behaviour()
{
    System.out.println("I am Man");
}

    public static void main(String[] args) {
        Man man = new Man();
        Human human = new Man();

        man.Behaviour();
        human.Behaviour();


    }
}