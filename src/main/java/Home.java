import java.util.ArrayList;

public class Home {

   ArrayList<Animal> animals = new ArrayList<>();

    public Animal adoptPet(Animal animal )

    {

        animals.add(animal);
//        Animal[] animals = new Animal[1];
//
//        for(int i = 0;i < animals.length;i++)
//        {
//            animals[i]=animal;
//        }
//
//        System.out.println(" ");
//       System.out.println(animal.getName());
//
         return animal;
    }
    public void makeAllSound()
    {
        for(Animal ani :this.animals)
        {
            ani.sound();
        }

    }
}
