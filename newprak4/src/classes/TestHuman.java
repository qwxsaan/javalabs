package classes;

public class TestHuman {
    public static void main(String[] args) {
        Head head = new Head("brown");
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(50);
        Hand rightHand = new Hand(50);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Human has " + human.getHead().getHairColor() + " hair.");
        System.out.println("Human's left leg is " + human.getLeftLeg().getLength() + " cm long.");
        System.out.println("Human's right leg is " + human.getRightLeg().getLength() + " cm long.");
        System.out.println("Human's left hand is " + human.getLeftHand().getLength() + " cm long.");
        System.out.println("Human's right hand is " + human.getRightHand().getLength() + " cm long.");
    }
}



