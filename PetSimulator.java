/*
 * Activity 3.6.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet[] pets = new Pet[4]; 
    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    pets[0] = new Pet("megatron", 1); 
    pets[1] = new Pet("starscream", 1); 
    pets[2] = new Pet("optimus prime", 2); 
    pets[3] = new Pet("bumblebee", 2); 
    // first things first, feed your pets
    for (Pet p : pets) {
      p.feed();
    }
    // next, make yourself the owner of all of your new pets
    for (Pet p : pets) {
      p.setOwner("Owner");
    }
    // your dogs make some noise, take them for a walk
    for (Pet p : pets) {
      if (p.getType() == 2) {
        p.walk();
      }
    }
    // when you get back, your cats make some noise
    for (Pet p : pets) {
      if (p.getType() == 1) {
        p.makeNoise(); 
      }
    }
    // give all of your pets a treat
    for (Pet p : pets) {
      p.giveTreat();
    }
    // groom your cats
    for (Pet p : pets) {
      if (p.getType() == 1) {
        p.groom();
      }
    }
    // grooming is done, play with all pets
    for (Pet p : pets) {
      p.play();
    }
    // whew, that was tiring, all pets nap and get fed
    for (Pet p : pets) {
      p.feed();
      p.sleep();
    }
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    
    // You decide to get a couple of pets for your friend (does not require looping)
    
    // set the owner of the new pets to your friends name
    
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets

  }
}