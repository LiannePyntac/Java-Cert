public class interfaces_research{
    public static void main(String[] args){
        Human Keira = new Human();
        Keira.speak();
        Keira.run();
        Keira.animalSound();
        Keira.walk();

    }
}

interface Animal{
    public void animalSound();
    public void run();
}

interface Primate{
    public void speak();
    public void walk();
}

class Tiger implements Animal{
    public void animalSound(){
        String message = "Rawr.... I am Khan and I rule this Jungle everyone msut bow down to me.";
        System.out.println(message);
    }
    public void run(){
        String message = "I am the fastest sprinter int eh animal world, I run 900 km/h";
        System.out.println(message);

    }
}


class Human implements Animal, Primate{
    public void animalSound(){
        String message = "Hey there I am a human, I can speak 7 languages.";
        System.out.println(message);
    }
    public void run(){
        String message = "I can run like Usain Bolt however that is almost impossible with the length of this legs";
        System.out.println(message);
    }
    public void speak(){
        String message = " I can speak English very well , I can read Shakespeare and sing like Madonna.";
        System.out.println(message);
    }
    public void walk(){
        String message = "I can walk with two legs, however in this earth some people are amputated.";
        System.out.println(message);

    }
}
