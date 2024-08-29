import java.util.Random; // Random Tool


//Die Class!

class Die {
    private int value;
    private Random random;

// Constructor method

    public Die () {
        value = 0;
        random = new Random();

 }

 // Roll method 

 public void roll() {
    value = random.nextInt(6) + 1;

 }

 // Equals method REQUIREMENT

 public boolean equals(Die die2){
    return this.value == die2.value;

 }

 // ToString method REQUIREMENT

 @Override

 public String toString() {
    switch (value) {

        case 1:
            return "one";

        case 2:
            return "two";

        case 3:
            return "three";

        case 4:
            return "four";

        case 5:
            return "five";

        case 6:
            return "six";

        default:
            return "invalid";
        }
    }
}


// Note : Have a good day :)