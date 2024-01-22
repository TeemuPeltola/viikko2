package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog(){
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void speak(String say) {
        System.out.println(name + ": " + say);
        
    } 

    public void run(int rounds){
        if (rounds<1){
            return;
        }
        System.out.println(name + " juoksee kovaa vauhtia!");
        run(rounds - 1);
    }

}

